package com.example.projectmanagement.task;

public class SimpleTask implements Task {
    private String name;

    public SimpleTask(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Executing simple task: " + name);
    }
}
