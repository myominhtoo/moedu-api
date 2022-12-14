package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.StudentService;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    private UserRepository userRepository;

    @Autowired
    public StudentServiceImpl( UserRepository userRepository ){
        this.userRepository = userRepository;
    }

    @Override
    public User createStudent(User student) {
        return null;
    }

    @Override
    public List<User> getAllStudents() {
        return this.userRepository.findUsersByRoleId(3);
    }
}
