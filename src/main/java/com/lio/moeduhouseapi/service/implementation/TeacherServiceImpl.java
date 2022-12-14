package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.TeacherService;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    private UserRepository userRepository;

    @Autowired
    public TeacherServiceImpl( UserRepository userRepository ){
        this.userRepository = userRepository;
    }

    @Override
    public User createTeacher(User teacher) {
        return null;
    }

    @Override
    public List<User> getAllTeachers() {
       return this.userRepository.findUsersByRoleId(2);
    }
}
