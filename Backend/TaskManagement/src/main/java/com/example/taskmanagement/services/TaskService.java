package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    ResponseEntity<Task> addTask(Task task);
}
