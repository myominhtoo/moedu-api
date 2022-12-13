package com.lio.moeduhouseapi.controller.v1.user.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lio.moeduhouseapi.model.dto.HttpResponse;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.implementation.StudentServiceImpl;

@RestController
@RequestMapping( value = "/api/v1" )
public class StudentController {
    
    private StudentServiceImpl studentService;

    @Autowired
    public StudentController( StudentServiceImpl studentService ){
        this.studentService = studentService;
    }

    /*
     * create new student
     */
    @PostMapping( value = "/students" )
    public HttpResponse<User> createNewStudent( @RequestBody User student ){
        return null;
    }

}
