package com.wujq.quiz.services.InheritanceStrategies.MappedSuperclassClass;


import com.wujq.quiz.model.InheritanceStrategies.MappedSuperclassClass.NonTeachingStaffMappedSuperclass;
import com.wujq.quiz.model.InheritanceStrategies.MappedSuperclassClass.TeachingStaffMappedSuperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveClientMappedSuperclass {
    public static void main( String[ ] args ) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Hibernate_JPA_MappedSuperclass" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        //Teaching staff entity
        TeachingStaffMappedSuperclass ts1 = new TeachingStaffMappedSuperclass("Gopal","MSc MEd","Maths");
        TeachingStaffMappedSuperclass ts2 = new TeachingStaffMappedSuperclass("Manisha", "BSc BEd", "English");

        //Non-Teaching StaffSingleTable entity
        NonTeachingStaffMappedSuperclass nts1 = new NonTeachingStaffMappedSuperclass("Satish", "Accounts");
        NonTeachingStaffMappedSuperclass nts2 = new NonTeachingStaffMappedSuperclass("Krishna", "Office Admin");

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
