package com.lio.moeduhouseapi.controller.v1.user.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lio.moeduhouseapi.model.dto.HttpResponse;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.implementation.StudentServiceImpl;

import java.util.List;

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

    /*
     * getting all students
     */
    @GetMapping( value = "/students" )
    public List<User> getAllStudents(){
        return this.studentService.getAllStudents();
    }
}
