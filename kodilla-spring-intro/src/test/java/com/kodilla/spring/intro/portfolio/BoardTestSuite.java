package com.kodilla.spring.intro.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {



    @Test
    void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
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
