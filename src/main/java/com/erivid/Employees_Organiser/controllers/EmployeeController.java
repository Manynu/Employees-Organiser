package com.erivid.Employees_Organiser.controllers;

import com.erivid.Employees_Organiser.models.Employee;
import com.erivid.Employees_Organiser.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("")
    String getHome() {
        return "index.html";
    }

    @GetMapping("employeeTable")
    String getEmployee(Model model) {
        List employee = employeeRepository.findAll();
        model.addAttribute("something", "Here you can see all your employees.");
        model.addAttribute("people", employee);
        //model.addAttribute("testName", "Cristi");
        return "employee.html";
    }

    @GetMapping("/employee")
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee.html";
    }

    @GetMapping("/employee/{id}")
    public String editEmployee(Model model, @PathVariable(value = "id") Integer id) {
        Employee attributeValue = employeeRepository.getById(id);
        model.addAttribute("employee", attributeValue);
        return "addEmployee.html";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Integer id) {
        employeeRepository.deleteById(id);
        return "redirect:/employeeTable";
    }

    @PostMapping("/employee")
    public String newEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/employeeTable";
    }
}
