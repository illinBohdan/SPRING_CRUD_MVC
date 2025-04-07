package com.javarush.dao;

import com.javarush.domain.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDAOImplement implements TaskDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Task> allTask() {
        return entityManager.createQuery("from Task", Task.class).getResultList();
    }

    @Override
    public void createTask(Task task) {
        entityManager.persist(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return entityManager.find(Task.class,id);
    }

    @Override
    public void updateTask(Task task) {
        entityManager.merge(task);
    }

    @Override
    public void deleteTask(Long id) {
        Task task = getTaskById(id);
        entityManager.remove(task);
    }

    @Override
    public List<Task> getTasks(int page, int pageSize) {
        return entityManager.createQuery("from Task", Task.class)
                .setFirstResult((page-1) * pageSize)
                .setMaxResults(pageSize)
                .getResultList();
    }
}
