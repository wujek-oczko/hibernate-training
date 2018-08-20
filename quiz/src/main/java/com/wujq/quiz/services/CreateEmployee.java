package com.wujq.quiz.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.wujq.quiz.model.Employee;

public class CreateEmployee {

    public static void main( String[ ] args ) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Hibernate_JPA" );

        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        Employee employee = new Employee( );
//        employee.setId( 1201 );
        employee.setEmployeeName( "Adam" );
        employee.setSalary( 40000 );
        employee.setDeg( "Lead" );

        entitymanager.persist( employee );
        entitymanager.getTransaction( ).commit( );

        entitymanager.close( );
        emfactory.close( );
    }
}
