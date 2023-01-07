package com.example.springboottemplate.controller;

import com.example.springboottemplate.entity.DemoEntity;
import com.example.springboottemplate.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    DemoService demoService;
    public DemoController(DemoService demoService) {
       this.demoService = demoService;
    }
    @GetMapping("/")
    public List<DemoEntity> index() {
        return demoService.findAll();
    }
}
