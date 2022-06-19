package com.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTestSuite {

    @Test
    void testToString() {
        //Given
        //Creating the TasksList for todos
        TasksList listToDo = new TasksList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task Number " + n)));

        //Creating the TaskList for tasks in progress
        TasksList inProgressTasks = new TasksList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> inProgressTasks.getTasks().add(new Task("In progress Tasks Number " + n)));

        //Creating the TaskList for done tasks
        TasksList doneTasksList = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> doneTasksList.getTasks().add(new Task("Done Tasks Number " + n)));

        //Creating the board and assigning the lists
        Board board = new Board("Project Number 1");
        board.getLists().add(listToDo);
        board.getLists().add(inProgressTasks);
        board.getLists().add(doneTasksList);

        //Making a shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project Number 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        //Making a deep clone of object board
        Board deepCloneBoard = null;
        try {
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project Number 3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        //NEW: removing elements
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepCloneBoard);
        assertEquals(2, board.getLists().size());
        assertEquals(2, clonedBoard.getLists().size());
        assertEquals(3, deepCloneBoard.getLists().size());
        assertEquals(clonedBoard.getLists(), board.getLists());
        assertNotEquals(deepCloneBoard.getLists(), board.getLists());
    }
}
