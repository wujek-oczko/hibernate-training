package com.wujq.quiz.services;

import com.wujq.quiz.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteEmployee {
    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Hibernate_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        Employee employee = entitymanager.find(Employee.class, 1);
        entitymanager.remove(employee);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}
