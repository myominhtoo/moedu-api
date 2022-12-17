package com.lio.moeduhouseapi.service.interfaces;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.model.entity.User;

import java.util.List;

public interface StudentService {

    User createStudent( User student ) throws DuplicateUserException;

    List<User> getAllStudents();
    
}

