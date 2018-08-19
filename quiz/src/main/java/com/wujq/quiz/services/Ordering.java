package com.wujq.quiz.services;

import com.wujq.quiz.Employee;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Ordering {

    public static void main( String[ ] args ) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Hibernate_JPA" );
        EntityManager entitymanager = emfactory.createEntityManager();

        //Between
        Query query = entitymanager.createQuery( "Select e " + "from Employee e " + "ORDER BY e.employeeName ASC" );

        List<Employee> list = (List<Employee>)query.getResultList( );

        for( Employee e:list ) {
            System.out.print("Employee ID :" + e.getId( ));
            System.out.println("\t Employee Name :" + e.getEmployeeName( ));
        }
    }
}