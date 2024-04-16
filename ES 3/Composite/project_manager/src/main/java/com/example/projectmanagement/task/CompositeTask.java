package com.example.projectmanagement.task;

import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {
    private List<Task> subtasks = new ArrayList<>();
    private String name;

    public CompositeTask(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        subtasks.add(task);
    }

    public void removeTask(Task task) {
        subtasks.remove(task);
    }

    @Override
    public void execute() {
        System.out.println("Executando tarefa composta: " + name);
        for (Task task : subtasks) {
            task.execute();
        }
    }
}