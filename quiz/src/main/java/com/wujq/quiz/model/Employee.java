package com.wujq.quiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String employeeName;
    private double salary;
    private String deg;

    public Employee(int id, String employeeName, double salary, String deg) {
        super( );
        this.id = id;
        this.employeeName = employeeName;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee( ) {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }


    @Override
    public String toString() {
        return "Employee [eid=" + id + ", ename=" + employeeName + ", salary=" + salary + ", deg=" + deg + "]";
    }
}
