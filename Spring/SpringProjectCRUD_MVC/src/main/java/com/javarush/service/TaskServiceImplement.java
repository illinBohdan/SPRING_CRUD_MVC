package com.javarush.service;

import com.javarush.dao.TaskDAO;
import com.javarush.domain.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TaskServiceImplement implements TaskService {

    private final TaskDAO taskDAO;

    public TaskServiceImplement(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @Override
    public List<Task> allTask() {
        return taskDAO.allTask();
    }

    @Override
    public void createTask(Task task) {
        taskDAO.createTask(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskDAO.getTaskById(id);
    }

    @Override
    public void updateTask(Task task) {
        taskDAO.updateTask(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskDAO.deleteTask(id);
    }

    @Override
    public List<Task> getTasks(int page, int pageSize) {
        return taskDAO.getTasks(page,pageSize);
    }
}
