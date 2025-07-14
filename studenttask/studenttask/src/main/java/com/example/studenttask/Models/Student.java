package com.example.studenttask.Models;

public class Student {
    private int stdid;
    private String stdname;
    private String department;

    public Student() {}

    public Student(int stdid, String stdname, String department) {
        this.stdid = stdid;
        this.stdname = stdname;
        this.department = department;
    }

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
