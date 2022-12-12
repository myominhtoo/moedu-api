package com.lio.moeduhouseapi.service.interfaces;

import com.lio.moeduhouseapi.model.entity.User;

public interface UserService {
    User createUser( User user );

    User updateUser( User user );

    User signinUser( User user );
}
