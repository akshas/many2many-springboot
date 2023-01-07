package com.example.springboottemplate.service;

import com.example.springboottemplate.entity.DemoEntity;
import com.example.springboottemplate.repository.DemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService{

    DemoRepository demoRepository;
    public DemoServiceImpl(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }
    @Override
    public DemoEntity findById(long id) {
        Optional<DemoEntity> optional = demoRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public List<DemoEntity> findAll() {
        return null;
    }
}
