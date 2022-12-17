package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.model.entity.Role;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.StudentService;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    private UserRepository userRepository;
    private UserServiceImpl userService;

    @Autowired
    public StudentServiceImpl( 
        UserRepository userRepository , 
        UserServiceImpl userService
    ){
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @Override
    public User createStudent(User student) throws DuplicateUserException {
        Role roleStudent = new Role();
        roleStudent.setId(3);

        student.setRole(roleStudent);

        return this.userService.createUser(student);
    }

    @Override
    public List<User> getAllStudents() {
        return this.userRepository.findUsersByRoleId(3);
    }
}
