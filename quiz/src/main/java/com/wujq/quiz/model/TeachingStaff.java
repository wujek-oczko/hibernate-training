package com.wujq.quiz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value="TS" )
public class TeachingStaff extends Staff {

    private String qualification;
    private String subjectexpertise;

    public TeachingStaff( String name,
                          String qualification,String subjectexpertise ) {
        super( name );
        this.qualification = qualification;
        this.subjectexpertise = subjectexpertise;
    }

    public TeachingStaff( ) {
        super( );
    }

    public String getQualification( ){
        return qualification;
    }

    public void setQualification( String qualification ){
        this.qualification = qualification;
    }

    public String getSubjectexpertise( ) {
        return subjectexpertise;
    }

    public void setSubjectexpertise( String subjectexpertise ){
        this.subjectexpertise = subjectexpertise;
    }
}