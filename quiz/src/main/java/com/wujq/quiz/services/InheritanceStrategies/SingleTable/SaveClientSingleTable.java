package com.wujq.quiz.services.InheritanceStrategies.SingleTable;

import com.wujq.quiz.model.InheritanceStrategies.SingleTable.NonTeachingStaffSingleTable;
import com.wujq.quiz.model.InheritanceStrategies.SingleTable.TeachingStaffSingleTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveClientSingleTable {

    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Hibernate_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        //Teaching staff entity
        TeachingStaffSingleTable ts1 = new TeachingStaffSingleTable("Gopal", "MSc MEd", "Maths");
        TeachingStaffSingleTable ts2 = new TeachingStaffSingleTable("Manisha", "BSc BEd", "English");

        //Non-Teaching StaffSingleTable entity
        NonTeachingStaffSingleTable nts1 = new NonTeachingStaffSingleTable("Satish", "Accounts");
        NonTeachingStaffSingleTable nts2 = new NonTeachingStaffSingleTable("Krishna", "Office Admin");

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
