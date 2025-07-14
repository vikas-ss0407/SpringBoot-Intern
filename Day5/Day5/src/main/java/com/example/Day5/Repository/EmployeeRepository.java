package com.example.Day5.Repository;

import com.example.Day5.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByEmail(String email);
}
