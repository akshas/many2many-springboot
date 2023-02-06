package com.example.springboottemplate.service.employee;

import com.example.springboottemplate.entity.Employee;
import com.example.springboottemplate.entity.Project;
import com.example.springboottemplate.repository.EmployeeRepository;
import com.example.springboottemplate.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;
    ProjectRepository projectRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ProjectRepository projectRepository) {
        this.employeeRepository = employeeRepository;
        this.projectRepository = projectRepository;
    }
    @Override
    public Employee findById(long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee assignProjectToEmployee(Long emplId, Long projectId) {
        Set<Project> projectSet;
        Employee employee = findById(emplId);
        Project project = projectRepository.findById(projectId).get();
        projectSet = employee.getProjects();
        projectSet.add(project);
        employee.setProjects(projectSet);
        return employeeRepository.save(employee);
    }
}
