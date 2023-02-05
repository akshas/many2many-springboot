package com.example.springboottemplate.service.project;

import com.example.springboottemplate.entity.Employee;
import com.example.springboottemplate.entity.Project;

import java.util.List;

public interface ProjectService {
    Project findById(long id);
    List<Project> findAll();

    void saveNewProject(Project project);
}
