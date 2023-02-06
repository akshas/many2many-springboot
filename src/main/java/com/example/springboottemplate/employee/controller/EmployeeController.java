package com.example.springboottemplate.employee.controller;

import com.example.springboottemplate.employee.entity.Employee;
import com.example.springboottemplate.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController() {

    }
    public List<Employee>getEmployees() {
        return null;
    }
    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable long empId) {
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping("/save")
    public ResponseEntity saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
