package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {
    private final String title;
    private final String description;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(final String title, final String description, final LocalDate created, final LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
}
