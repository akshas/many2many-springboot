package com.example.springboottemplate.controller;

import com.example.springboottemplate.entity.Project;
import com.example.springboottemplate.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    ProjectService service;

    @Autowired
    public ProjectController(ProjectService service) {
         this.service = service;
    }


    @PostMapping("/save")
    public ResponseEntity<Project> saveProject(@RequestBody Project projectObj) {
        service.saveNewProject(projectObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
