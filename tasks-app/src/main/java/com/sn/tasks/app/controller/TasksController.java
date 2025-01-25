package com.sn.tasks.app.controller;

import com.sn.tasks.app.mongo.model.Tasks;
import com.sn.tasks.app.mongo.repository.TasksRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    private final TasksRepo tasksRepo;

    public TasksController(TasksRepo tasksRepo) {
        this.tasksRepo = tasksRepo;
    }


    @PostMapping("/add")
    public Tasks addTask (@RequestBody Tasks tasks) {
        return tasksRepo.save(tasks);
    }

    @GetMapping
    public List<Tasks> getAllTasks () {
        return tasksRepo.findAll();
    }

}
