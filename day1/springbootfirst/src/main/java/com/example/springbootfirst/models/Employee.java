package com.example.springbootfirst.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;

    private String name;
    private String job;
    private String role;
    private Date dsteofbirth;
    private String mobileno;

    public Employee() {
    }

    public int getEmpID() {
        return empID;
    }

    public Employee( String name, String job, String role, Date dsteofbirth, String mobileno) {

        this.name = name;
        this.job = job;
        this.role = role;
        this.dsteofbirth = dsteofbirth;
        this.mobileno = mobileno;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDsteofbirth() {
        return dsteofbirth;
    }

    public void setDsteofbirth(Date dsteofbirth) {
        this.dsteofbirth = dsteofbirth;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }
}
