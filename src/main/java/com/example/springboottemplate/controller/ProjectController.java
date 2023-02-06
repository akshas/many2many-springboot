package com.example.springboottemplate.controller;

import com.example.springboottemplate.entity.Project;
import com.example.springboottemplate.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/project")
public class ProjectController {

    ProjectService service;

    @Autowired
    public ProjectController(ProjectService service) {
         this.service = service;
    }

    @GetMapping("/project")
    public List<Project> getProjects() {
        return service.findAll();
    }

    @GetMapping("/project/{projectId}")
    public Project getProjectById(@PathVariable long projectId) {
        return service.findById(projectId);
    }

    @PostMapping("/project/save")
    public ResponseEntity<Project> saveProject(@RequestBody Project projectObj) {
        service.saveNewProject(projectObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
