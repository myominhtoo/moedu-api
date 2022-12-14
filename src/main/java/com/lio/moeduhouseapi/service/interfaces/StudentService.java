package com.lio.moeduhouseapi.service.interfaces;

import com.lio.moeduhouseapi.model.entity.User;

import java.util.List;

public interface StudentService {

    User createStudent( User student );

    List<User> getAllStudents();
    
}

