package com.lio.moeduhouseapi.controller.v1.user.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lio.moeduhouseapi.model.dto.HttpResponse;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.implementation.TeacherServiceImpl;

import java.util.List;

@RestController
@RequestMapping( value = "/api/v1" )
public class TeacherController {
    
    private TeacherServiceImpl teacherService;

    @Autowired
    public TeacherController( TeacherServiceImpl teacherService ){
        this.teacherService = teacherService;
    }

    /*
     * create new teacher 
     */
    @PostMapping( value = "/teachers" )
    public HttpResponse<User> createNewTeacher( @RequestBody User teacher ){
        return null;
    }

    /*
     * getting all teachers
     */
    @GetMapping( value = "/teachers" )
    public List<User> getAllTeachers(){
        return this.teacherService.getAllTeachers();
    }
}
