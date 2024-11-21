package com.todo.todoapp.service;

import com.todo.todoapp.dto.TaskRequest;
import com.todo.todoapp.dto.TaskResponse;

public interface TaskService {
    TaskResponse createTask(TaskRequest taskRequest);

}
