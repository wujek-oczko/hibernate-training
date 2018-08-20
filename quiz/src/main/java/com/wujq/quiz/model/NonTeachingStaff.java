package com.wujq.quiz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value = "NS" )
public class NonTeachingStaff extends Staff {

    private String areaexpertise;

    public NonTeachingStaff( String name, String areaexpertise ) {
        super( name );
        this.areaexpertise = areaexpertise;
    }

    public NonTeachingStaff( ) {
        super( );
    }

    public String getAreaexpertise( ) {
        return areaexpertise;
    }

    public void setAreaexpertise( String areaexpertise ){
        this.areaexpertise = areaexpertise;
    }
}