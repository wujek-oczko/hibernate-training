package com.wujq.quiz.services.InheritanceStrategies.TablePerClass;

import com.wujq.quiz.model.InheritanceStrategies.TablePerClass.TPCNonTeachingStaff;
import com.wujq.quiz.model.InheritanceStrategies.TablePerClass.TPCTeachingStaff;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TPCSaveClient {
    public static void main( String[ ] args ) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Hibernate_JPA_TPC" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        //Teaching staff entity
        TPCTeachingStaff ts1 = new TPCTeachingStaff("Gopal","MSc MEd","Maths");
        TPCTeachingStaff ts2 = new TPCTeachingStaff("Manisha", "BSc BEd", "English");

        //Non-Teaching StaffSingleTable entity
        TPCNonTeachingStaff nts1 = new TPCNonTeachingStaff("Satish", "Accounts");
        TPCNonTeachingStaff nts2 = new TPCNonTeachingStaff("Krishna", "Office Admin");

        //storing all entities
        entitymanager.persist(ts1);
        entitymanager.persist(ts2);
        entitymanager.persist(nts1);
        entitymanager.persist(nts2);

        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}
