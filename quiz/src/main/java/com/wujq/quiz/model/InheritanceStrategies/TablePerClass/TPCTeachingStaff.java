package com.wujq.quiz.model.InheritanceStrategies.TablePerClass;

import javax.persistence.Entity;

@Entity
public class TPCTeachingStaff extends TPCStaff {
    private String qualification;
    private String subjectexpertise;

    public TPCTeachingStaff( String sname, String qualification, String subjectexpertise ) {
        super( sname );
        this.qualification = qualification;
        this.subjectexpertise = subjectexpertise;
    }

    public TPCTeachingStaff( ) {
        super( );
    }

    public String getQualification( ){
        return qualification;
    }

    public void setQualification( String qualification ) {
        this.qualification = qualification;
    }

    public String getSubjectexpertise( ) {
        return subjectexpertise;
    }

    public void setSubjectexpertise( String subjectexpertise ){
        this.subjectexpertise = subjectexpertise;
    }
}
