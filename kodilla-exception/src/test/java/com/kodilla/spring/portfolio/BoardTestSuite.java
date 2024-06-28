package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {

        String toDoTask = "Task to do";
        String inProgressTask = "Task in progress";
        String doneTask = "Task done";


        board.getToDoList().addTask(toDoTask);
        board.getInProgressList().addTask(inProgressTask);
        board.getDoneList().addTask(doneTask);


        assertEquals(1, board.getToDoList().getTasks().size());
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(1, board.getDoneList().getTasks().size());

        assertEquals(toDoTask, board.getToDoList().getTasks().get(0));
        assertEquals(inProgressTask, board.getInProgressList().getTasks().get(0));
        assertEquals(doneTask, board.getDoneList().getTasks().get(0));
    }
}
