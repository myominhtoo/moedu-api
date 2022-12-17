package com.lio.moeduhouseapi.controller.v1.user.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.model.dto.HttpResponse;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.implementation.TeacherServiceImpl;
import com.lio.moeduhouseapi.util.HttpHelper;

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
    public ResponseEntity<HttpResponse<User>> createNewTeacher( @RequestBody User teacher ) throws DuplicateUserException{
        User createdTeacher = this.teacherService.createTeacher(teacher);
        return ResponseEntity.ok().body(
            new HttpHelper<User>()
            .getHttpResponse( createdTeacher != null , "Successfully Created!", "Failed to create!", createdTeacher )
        );
    }

    /*
     * getting all teachers
     */
    @GetMapping( value = "/teachers" )
    public List<User> getAllTeachers(){
        return this.teacherService.getAllTeachers();
    }
}
