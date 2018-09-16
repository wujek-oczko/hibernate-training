package com.wujq.quiz.model.InheritanceStrategies.SingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaffSingleTable extends StaffSingleTable {

    private String areaexpertise;

    public NonTeachingStaffSingleTable(String name, String areaexpertise) {
        super(name);
        this.areaexpertise = areaexpertise;
    }

    public NonTeachingStaffSingleTable() {
        super();
    }

    public String getAreaexpertise() {
        return areaexpertise;
    }

    public void setAreaexpertise(String areaexpertise) {
        this.areaexpertise = areaexpertise;
    }
}