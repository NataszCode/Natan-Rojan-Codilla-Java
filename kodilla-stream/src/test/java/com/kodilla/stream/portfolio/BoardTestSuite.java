package com.kodilla.stream.portfolio;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testAddTaskListAverageWorkingOnTask() {
        
        Task task1 = new Task("Task 1", "Description 1", LocalDate.now().minusDays(10), LocalDate.now().plusDays(20));
        Task task2 = new Task("Task 2", "Description 2", LocalDate.now().minusDays(5), LocalDate.now().plusDays(15));
        Task task3 = new Task("Task 3", "Description 3", LocalDate.now().minusDays(2), LocalDate.now().plusDays(30));
        Task task4 = new Task("Task 4", "Description 3", LocalDate.now().minusDays(2), LocalDate.now().plusDays(30));

        TaskList taskListInProgress = new TaskList("In Progress", List.of(task1, task2, task3));
        TaskList taskListDone = new TaskList("Done", List.of(task4));

        Board board = new Board();
        board.addTaskList(taskListInProgress);
        board.addTaskList(taskListDone);

        
        double averageDays = board.averageTaskListWorkload("In Progress");

        
        assertEquals(5.67, averageDays, 0.01);
    }
}
