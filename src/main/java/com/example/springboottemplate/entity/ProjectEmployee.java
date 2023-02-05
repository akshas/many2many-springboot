package com.example.springboottemplate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_project")
public class ProjectEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_project_id")
    private long id;
    @Column(name="project_id")
    private long projectId;
    @Column(name="employee_id")
    private long employeeId;
}
