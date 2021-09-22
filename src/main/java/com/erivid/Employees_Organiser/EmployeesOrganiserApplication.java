package com.erivid.Employees_Organiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class EmployeesOrganiserApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeesOrganiserApplication.class, args);

		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "LocalDatabase");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
