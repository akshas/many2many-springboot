package com.example.springboottemplate.controller;

import com.example.springboottemplate.entity.Employee;
import com.example.springboottemplate.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
       this.employeeService = employeeService;
    }
    @GetMapping("/")
    public List<Employee> index() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id") Long empId) {
        return employeeService.findById(empId);
    }
    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
