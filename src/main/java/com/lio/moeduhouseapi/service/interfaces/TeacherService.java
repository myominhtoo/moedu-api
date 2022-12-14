package com.lio.moeduhouseapi.service.interfaces;

import com.lio.moeduhouseapi.model.entity.User;
import java.util.List;

public interface TeacherService {
    
    User createTeacher( User teacher );

    List<User> getAllTeachers();

}
