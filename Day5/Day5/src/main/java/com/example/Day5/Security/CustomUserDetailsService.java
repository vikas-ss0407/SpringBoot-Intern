package com.example.Day5.Security;

import com.example.Day5.Models.Employee;
import com.example.Day5.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Employee emp = employeeRepository.findByEmail(email);
        if (emp == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return new User(
                emp.getEmail(),
                emp.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + emp.getRole()))
        );
    }
}
