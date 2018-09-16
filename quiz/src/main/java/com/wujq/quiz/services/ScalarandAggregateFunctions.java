package com.wujq.quiz.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ScalarandAggregateFunctions {
    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Hibernate_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();

        //Scalar function
        Query query = entitymanager.
                createQuery("Select UPPER(e.employeeName) from Employee e");
        List<String> list = query.getResultList();

        for (String e : list) {
            System.out.println("Employee NAME :" + e);
        }

        //Aggregate function
        Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
        Double result = (Double) query1.getSingleResult();
        System.out.println("Max Employee Salary :" + result);
    }
}
