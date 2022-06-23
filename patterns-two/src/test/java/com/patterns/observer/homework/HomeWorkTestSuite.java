package com.patterns.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeWorkTestSuite {

    @Test
    void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        TaskQueue taskQueue1 = new TaskQueue("Student 1");
        TaskQueue taskQueue2 = new TaskQueue("Student 2");
        TaskQueue taskQueue3 = new TaskQueue("Student 3");
        TaskQueue taskQueue4 = new TaskQueue("Student 4");
        taskQueue1.registerObserver(mentor1);
        taskQueue2.registerObserver(mentor2);
        taskQueue3.registerObserver(mentor1);
        taskQueue4.registerObserver(mentor2);

        //When
        taskQueue1.addTask("Task 1");
        taskQueue1.addTask("Task 2");
        taskQueue2.addTask("Task 1");
        taskQueue3.addTask("Task 1");
        taskQueue3.addTask("Task 2");
        taskQueue4.addTask("Task 3");
        taskQueue4.addTask("Task 4");

        //Then
        assertEquals(4, mentor1.getCount());
        assertEquals(3, mentor2.getCount());

    }
}
