package com.example.projectmanagement;

import com.example.projectmanagement.task.CompositeTask;
import com.example.projectmanagement.task.SimpleTask;
import com.example.projectmanagement.task.Task;

public class ProjectManagementApp {
    public static void main(String[] args) {
        // Criar tasks simples individuais
        Task task1 = new SimpleTask("Escreva código");
        Task task2 = new SimpleTask("Teste o código");

        // Criar task compostas agregando outras tasks individuais
        CompositeTask project = new CompositeTask("Desenvolver um Projeto");
        project.addTask(task1);
        project.addTask(task2);

        // Criar subtasks para definir o procedimento das tasks
        Task subtask1 = new SimpleTask("Design UI");
        Task subtask2 = new SimpleTask("Implementar Backend");

        // Criar a fase onde as subtasks serão rodadas
        CompositeTask phase1 = new CompositeTask("Fase 1");
        phase1.addTask(subtask1);
        phase1.addTask(subtask2);

        // Adicionar as fase ao projeto
        project.addTask(phase1);

        // Rodar o projeto
        project.execute();
    }
}