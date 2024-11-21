package com.todo.todoapp.service;

import com.todo.todoapp.dto.TaskRequest;
import com.todo.todoapp.dto.TaskResponse;
import com.todo.todoapp.models.Task;
import com.todo.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        // Mapear DTO a Entity
        Task task = new Task();
        task.setTitle(taskRequest.getTitle());
        task.setStatus("pending");

        // Guardar en la base de datos
        Task savedTask = taskRepository.save(task);

        // Mapear Entity a DTO de respuesta
        return new TaskResponse(savedTask.getId(), savedTask.getTitle(), savedTask.getStatus());
    }
}
