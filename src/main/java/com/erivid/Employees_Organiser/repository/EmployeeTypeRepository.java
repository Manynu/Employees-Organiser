package com.erivid.Employees_Organiser.repository;

import com.erivid.Employees_Organiser.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {
}
