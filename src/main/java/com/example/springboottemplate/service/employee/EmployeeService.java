package com.example.springboottemplate.service.employee;

import com.example.springboottemplate.entity.Employee;
import com.example.springboottemplate.entity.Project;

import java.util.List;

public interface EmployeeService {
    Employee findById(long id);
    List<Employee> findAll();
    void saveEmployee(Employee employee);
    Employee assignProjectToEmployee(Long emplId, Long project);
}
