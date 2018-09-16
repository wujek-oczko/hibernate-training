package com.wujq.quiz.services;

import com.wujq.quiz.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BetweenAndLikeFunctions {
    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Hibernate_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();

        //Between
        Query query = entitymanager.createQuery("Select e " + "from Employee e " + "where e.salary " + "Between 30000 and 40000");

        List<Employee> list = (List<Employee>) query.getResultList();

        for (Employee e : list) {
            System.out.print("Employee ID :" + e.getId());
            System.out.println("\t Employee salary :" + e.getSalary());
        }

        //Like
        Query query1 = entitymanager.createQuery("Select e " + "from Employee e " + "where e.ename LIKE 'M%'");

        List<Employee> list1 = (List<Employee>) query1.getResultList();

        for (Employee e : list1) {
            System.out.print("Employee ID :" + e.getId());
            System.out.println("\t Employee name :" + e.getEmployeeName());
        }
    }
}
