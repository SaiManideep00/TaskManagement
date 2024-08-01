package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Task;
import com.example.taskmanagement.repositories.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{
    private TaskRepository taskRepository;
    public TaskServiceImpl(TaskRepository taskRepository)
    {
        this.taskRepository=taskRepository;
    }
    @Override
    public ResponseEntity<Task> addTask(Task task) {
        System.out.println("Date is"+task.getDueDate());

        return new ResponseEntity<>(taskRepository.save(task), HttpStatus.OK);
    }
}
