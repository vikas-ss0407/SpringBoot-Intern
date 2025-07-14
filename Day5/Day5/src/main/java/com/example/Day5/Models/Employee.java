package com.example.Day5.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;

    private String empname;
    private String job;

    @Temporal(TemporalType.DATE)
    private Date dob;

    private String phoneno;
    private String email;
    private String password;

    private String role; // e.g., ADMIN or USER

    public Employee() {}

    public Employee(int empid, String empname, String job, Date dob, String phoneno, String email, String password, String role) {
        this.empid = empid;
        this.empname = empname;
        this.job = job;
        this.dob = dob;
        this.phoneno = phoneno;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Getters and setters
    public int getEmpid() { return empid; }
    public void setEmpid(int empid) { this.empid = empid; }

    public String getEmpname() { return empname; }
    public void setEmpname(String empname) { this.empname = empname; }

    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }

    public Date getDob() { return dob; }
    public void setDob(Date dob) { this.dob = dob; }

    public String getPhoneno() { return phoneno; }
    public void setPhoneno(String phoneno) { this.phoneno = phoneno; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
