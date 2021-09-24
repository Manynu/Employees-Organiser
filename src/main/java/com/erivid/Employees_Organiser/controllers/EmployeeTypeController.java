package com.erivid.Employees_Organiser.controllers;

import com.erivid.Employees_Organiser.models.EmployeeType;
import com.erivid.Employees_Organiser.repository.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;


@Controller
public class EmployeeTypeController {

    @Autowired
    EmployeeTypeRepository employeeTypeRepository;


}