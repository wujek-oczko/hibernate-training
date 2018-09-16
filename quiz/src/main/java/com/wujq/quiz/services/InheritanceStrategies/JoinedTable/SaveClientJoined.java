package com.wujq.quiz.services.InheritanceStrategies.JoinedTable;

import com.wujq.quiz.model.InheritanceStrategies.JoinedTable.NonTeachingStaffJoined;
import com.wujq.quiz.model.InheritanceStrategies.JoinedTable.TeachingStaffJoined;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveClientJoined {
    public static void main( String[ ] args ) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Hibernate_JPA_Joined" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        //Teaching staff entity
        TeachingStaffJoined ts1 = new TeachingStaffJoined("Gopal","MSc MEd","Maths");
        TeachingStaffJoined ts2 = new TeachingStaffJoined("Manisha", "BSc BEd", "English");

        //Non-Teaching StaffSingleTable entity
        NonTeachingStaffJoined nts1 = new NonTeachingStaffJoined("Satish", "Accounts");
        NonTeachingStaffJoined nts2 = new NonTeachingStaffJoined("Krishna", "Office Admin");

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
