package com.bdit.springboot.service.impl;

import com.bdit.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "say Hello";
    }
}
