package com.wujq.quiz.model.InheritanceStrategies.JoinedTable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")

public class TeachingStaffJoined extends StaffJoined {
    private String qualification;
    private String subjectexpertise;

    public TeachingStaffJoined(String sname, String qualification, String subjectexpertise) {
        super(sname);
        this.qualification = qualification;
        this.subjectexpertise = subjectexpertise;
    }

    public TeachingStaffJoined() {
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
