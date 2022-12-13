package com.lio.moeduhouseapi.service.implementation;

import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Override
    public User createStudent(User student) {
        return null;
    }
    
}
