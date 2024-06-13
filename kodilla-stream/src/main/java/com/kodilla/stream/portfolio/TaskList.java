package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public TaskList(final String name, final List<Task> tasks) {
        this.name = name;
        this.tasks.addAll(tasks);
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}
