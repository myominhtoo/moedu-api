package com.lio.moeduhouseapi.controller.v1.user.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.model.dto.HttpResponse;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.implementation.StudentServiceImpl;
import com.lio.moeduhouseapi.util.HttpHelper;

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
    public ResponseEntity<HttpResponse<User>> createNewStudent( @RequestBody User student ) throws DuplicateUserException{
        User createdStudent = this.studentService.createStudent(student);
        return ResponseEntity.ok().body(
            new HttpHelper<User>()
            .getHttpResponse( createdStudent != null , "Successfully Created!", "Failed to create!", createdStudent )
        );
    }

    /*
     * getting all students
     */
    @GetMapping( value = "/students" )
    public List<User> getAllStudents(){
        return this.studentService.getAllStudents();
    }
}
