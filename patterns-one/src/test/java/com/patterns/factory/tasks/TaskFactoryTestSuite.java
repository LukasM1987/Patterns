package com.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.SHOPPING);

        //Then
        assertEquals("Shopping", task.getTaskName());
        assertEquals(task.getTaskName() + " has been executed, was bought " + "Fruits" + ", quantity: " + 3.0, task.executeTask());
        assertTrue(task.isTaskExecuted());
    }
}
