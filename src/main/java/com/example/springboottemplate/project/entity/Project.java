package com.example.springboottemplate.project.entity;

import com.example.springboottemplate.employee.entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data@NoArgsConstructor
@AllArgsConstructor
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="project_id")
    private long projectId;
    @Column(name="project_name")
    private long projectName;

    @JsonIgnore
    @ManyToMany(mappedBy = "projects")
    Set<Employee> employees = new HashSet<>();
}
