package com.wujq.quiz.model.InheritanceStrategies.JoinedTable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")

public class NonTeachingStaffJoined extends StaffJoined {
    private String areaexpertise;

    public NonTeachingStaffJoined(String sname, String areaexpertise) {
        super(sname);
        this.areaexpertise = areaexpertise;
    }

    public NonTeachingStaffJoined() {
        super();
    }

    public String getAreaexpertise() {
        return areaexpertise;
    }

    public void setAreaexpertise(String areaexpertise) {
        this.areaexpertise = areaexpertise;
    }
}
