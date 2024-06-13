package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList<>();

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }

    public double averageTaskListWorkload(String tasksStatus) {
        return taskLists.stream()
                .filter(taskList -> taskList.getName().equals(tasksStatus))
                .flatMap(taskList -> taskList.getTasks().stream())
                .mapToLong(task -> ChronoUnit.DAYS.between(task.getCreated(), LocalDate.now()))
                .average()
                .orElse(0.0);
    }
}
