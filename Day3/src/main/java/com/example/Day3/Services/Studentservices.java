package com.example.Day3.Services;

import com.example.Day3.Models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class Studentservices {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getAllStudents() {
        return studentList;
    }


    public String addstudent(Student student) {

        for (Student s : studentList) {
            if (s.getStdid() == student.getStdid()) {
                return "Student ID already exists";
            }
        }
        studentList.add(student);
        return "Student added successfully";
    }


    public String deletestudent(int id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getStdid() == id) {
                iterator.remove();
                return "Student deleted";
            }
        }
        return "Student not found";
    }
}


