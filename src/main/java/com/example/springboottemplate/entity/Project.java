package com.example.springboottemplate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="project_id")
    private long projectId;
    @Column(name="project_name")
    private String projectName;

    @ManyToMany(mappedBy = "employees")
    private Set<Employee> employees = new HashSet<>();
}
