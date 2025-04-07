package com.javarush.controller;

import com.javarush.domain.Task;
import com.javarush.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String getTasks(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                           Model model) {
        List<Task> tasks = taskService.getTasks(page, pageSize);
        model.addAttribute("tasks", tasks);
        model.addAttribute("currentPage", page);
        model.addAttribute("pageSize", pageSize);
        return "index";
    }

    @GetMapping("/addNew")
    public String addNewTask(Task task, Model model){
        model.addAttribute("task", task);
        return "new-task";
    }

     @GetMapping("delete-task/{id}")
    public String delete(@PathVariable(value = "id") Long id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/show-update-task-page/{id}")
    public String updateForm(@PathVariable(value = "id") Long id, Model model) {
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);
        return "update";
    }

    @PostMapping("save")
    public String saveTask(@ModelAttribute("task") Task task) {
        taskService.updateTask(task);
        return "redirect:/";
    }


}
