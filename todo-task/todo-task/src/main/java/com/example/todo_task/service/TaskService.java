package com.example.todo_task.service;

import com.example.todo_task.model.Task;
import com.example.todo_task.model.TaskStatus;
import com.example.todo_task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepo;

    public Task createTask(Task task) {
        task.setStatus(TaskStatus.YET_TO_START);
        return taskRepo.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }

    public Task updateStatus(Long id, TaskStatus status) {
        Task task = taskRepo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setStatus(status);
        return taskRepo.save(task);
    }
}
