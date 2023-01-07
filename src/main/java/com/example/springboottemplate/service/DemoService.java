package com.example.springboottemplate.service;

import com.example.springboottemplate.entity.DemoEntity;

import java.util.List;

public interface DemoService {
    DemoEntity findById(long id);
    List<DemoEntity> findAll();
}
