package com.example.Day5;

import com.example.Day5.Models.Employee;
import com.example.Day5.Repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Day5Application {

	public static void main(String[] args) {
		SpringApplication.run(Day5Application.class, args);
	}

	@Bean
	public CommandLineRunner createAdmin(EmployeeRepository repo, PasswordEncoder encoder) {
		return args -> {
			if (repo.findByEmail("admin@example.com") == null) {
				Employee admin = new Employee();
				admin.setEmpname("Admin User");
				admin.setJob("Manager");
				admin.setDob(new java.util.Date()); // or LocalDate if using Java 8+
				admin.setPhoneno("9999999999");
				admin.setEmail("admin@example.com");
				admin.setPassword(encoder.encode("admin123")); // 🔐 Encrypt password
				admin.setRole("ADMIN");
				repo.save(admin);
				System.out.println("✅ Default admin created.");
			}
		};
	}
}
