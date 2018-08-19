package com.wujq.quiz.services;

import com.wujq.quiz.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmployee {
    public static void main( String[ ] args ) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Hibernate_JPA" );
        EntityManager entitymanager = emfactory.createEntityManager();
        Employee employee = entitymanager.find( Employee.class, 1 );

        System.out.println("employee ID = " + employee.getId( ));
        System.out.println("employee NAME = " + employee.getEmployeeName( ));
        System.out.println("employee SALARY = " + employee.getSalary( ));
        System.out.println("employee DESIGNATION = " + employee.getDeg( ));
    }
}
