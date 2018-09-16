package com.wujq.quiz.model.InheritanceStrategies.TablePerClass;

import javax.persistence.Entity;

@Entity
public class TPCNonTeachingStaff extends TPCStaff {
    private String areaexpertise;

    public TPCNonTeachingStaff(String sname, String areaexpertise ) {
        super(sname );
        this.areaexpertise = areaexpertise;
    }

    public TPCNonTeachingStaff( ) {
        super( );
    }

    public String getAreaexpertise( ) {
        return areaexpertise;
    }

    public void setAreaexpertise( String areaexpertise ) {
        this.areaexpertise = areaexpertise;
    }
}
