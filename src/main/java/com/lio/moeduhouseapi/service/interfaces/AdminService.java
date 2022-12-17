package com.lio.moeduhouseapi.service.interfaces;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.model.entity.User;

import java.util.List;

public interface AdminService {
    
    User createAdmin( User admin ) throws DuplicateUserException;

    List<User> getAllAdmins();

}
