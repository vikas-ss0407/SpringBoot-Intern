package com.example.studenttask.Controllers;

import com.example.studenttask.Models.Student;
import com.example.studenttask.Services.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studentcontroller {
    @Autowired
    private Studentservices stdserv;
    @GetMapping("/Student")
    public List<Student> getAll() {
        return stdserv.getAllStudents();
    }
    @PostMapping("/Student")
    public String add(@RequestBody Student student){
   return stdserv.addstudent(student);
    }
  @DeleteMapping("/Student/{id}")
    public String delete(@PathVariable int id){
        return stdserv.deletestudent(id);
  }
}
