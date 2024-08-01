package com.example.taskmanagement.controllers;


import com.example.taskmanagement.models.Task;
import com.example.taskmanagement.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TaskController {
    private TaskService taskService;
    public TaskController(TaskService taskService)
    {
        this.taskService=taskService;
    }
    @PostMapping()
    public ResponseEntity<Task> addTask(@RequestBody Task task)
    {
        return taskService.addTask(task);
    }
}
