package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {

        TaskFactory factory = new TaskFactory();


        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        shopping.executeTask();


        assertEquals("Buy groceries", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {

        TaskFactory factory = new TaskFactory();


        Task painting = factory.createTask(TaskFactory.PAINTING);
        painting.executeTask();


        assertEquals("Paint room", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {

        TaskFactory factory = new TaskFactory();


        Task driving = factory.createTask(TaskFactory.DRIVING);
        driving.executeTask();


        assertEquals("Drive to work", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}
