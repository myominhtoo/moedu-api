package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.model.entity.Role;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.TeacherService;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    private UserRepository userRepository;
    private UserServiceImpl userService;

    @Autowired
    public TeacherServiceImpl( 
        UserRepository userRepository ,
        UserServiceImpl userService
    ){
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @Override
    public User createTeacher(User teacher) throws DuplicateUserException {
        Role roleTeacher = new Role();
        roleTeacher.setId(2);

        teacher.setRole(roleTeacher);

        return this.userService.createUser(teacher);
    }

    @Override
    public List<User> getAllTeachers() {
       return this.userRepository.findUsersByRoleId(2);
    }
}
