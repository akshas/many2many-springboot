package com.example.springboottemplate.service.project;

import com.example.springboottemplate.entity.Employee;
import com.example.springboottemplate.entity.Project;
import com.example.springboottemplate.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project findById(long id) {
        Optional<Project> optional = projectRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public void saveNewProject(Project project) {
        projectRepository.save(project);
    }
}
