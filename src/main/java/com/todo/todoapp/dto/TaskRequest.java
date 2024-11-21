package com.todo.todoapp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TaskRequest {
    @NotBlank(message = "El título es obligatorio")
    private String title;
}
