package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    ResponseEntity<Task> addTask(Task task);

    ResponseEntity<List<Task>> getAllTasks();
}
