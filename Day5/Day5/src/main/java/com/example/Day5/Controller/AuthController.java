package com.example.Day5.Controller;

import com.example.Day5.Models.Employee;
import com.example.Day5.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Employee loginRequest) {
        Employee emp = employeeRepository.findByEmail(loginRequest.getEmail());
        if (emp != null && emp.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful. Welcome " + emp.getEmpname() + "!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
