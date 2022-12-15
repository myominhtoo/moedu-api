package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.CourseRepository;
import com.lio.moeduhouseapi.service.interfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepo;

    @Autowired
    public CourseServiceImpl( CourseRepository courseRepo ){
        this.courseRepo = courseRepo;
    }

}
