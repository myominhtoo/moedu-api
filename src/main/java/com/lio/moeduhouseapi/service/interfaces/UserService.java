package com.lio.moeduhouseapi.service.interfaces;

import org.springframework.web.servlet.view.RedirectView;

import com.lio.moeduhouseapi.model.entity.User;

public interface UserService {
    User createUser( User user );

    RedirectView verifyEmail( String email );

    User updateUser( User user );

    User signinUser( User user );

    boolean isUserDuplicate( User user );
}
