package com.todo.todoapp.dto;

import lombok.Data;

@Data
public class TaskResponse {
    private Long id;
    private String title;
    private String status;

    // Constructor con argumentos
    public TaskResponse(Long id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }
}
