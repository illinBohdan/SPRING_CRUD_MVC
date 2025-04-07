package com.javarush.dao;

import com.javarush.domain.Task;

import java.util.List;

public interface TaskDAO {

    List<Task> allTask();
    void createTask(Task task);
    Task getTaskById(Long id);
    void updateTask(Task task);
    void deleteTask(Long id);
    List<Task> getTasks(int page, int pageSize);

}
