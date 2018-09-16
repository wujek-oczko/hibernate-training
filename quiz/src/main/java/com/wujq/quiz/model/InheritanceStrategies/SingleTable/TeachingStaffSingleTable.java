package com.wujq.quiz.model.InheritanceStrategies.SingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")
public class TeachingStaffSingleTable extends StaffSingleTable {

    private String qualification;
    private String subjectexpertise;

    public TeachingStaffSingleTable(String name,
                                    String qualification, String subjectexpertise) {
        super(name);
        this.qualification = qualification;
        this.subjectexpertise = subjectexpertise;
    }

    public TeachingStaffSingleTable() {
        super();
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSubjectexpertise() {
        return subjectexpertise;
    }

    public void setSubjectexpertise(String subjectexpertise) {
        this.subjectexpertise = subjectexpertise;
    }
}