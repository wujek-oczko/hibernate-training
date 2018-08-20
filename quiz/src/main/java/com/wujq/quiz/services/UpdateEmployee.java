package com.wujq.quiz.services;

import com.wujq.quiz.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEmployee {
    public static void main( String[ ] args ) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Hibernate_JPA" );

        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );
        Employee employee = entitymanager.find( Employee.class, 1 );

        //before update
        System.out.println( employee );
        employee.setSalary( 46000 );
        entitymanager.getTransaction( ).commit( );

        //after update
        System.out.println( employee );
        entitymanager.close();
        emfactory.close();
    }
}
