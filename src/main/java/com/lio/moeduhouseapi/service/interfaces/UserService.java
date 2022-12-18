package com.lio.moeduhouseapi.service.interfaces;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.servlet.view.RedirectView;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.exception.custom.Index.InvalidUserIdExcepton;
import com.lio.moeduhouseapi.model.entity.User;

import java.util.List;

public interface UserService {

    User createUser( User user ) throws DuplicateUserException;

    RedirectView verifyEmail( String email );

    User updateUser( User user ) throws InvalidUserIdExcepton , BadCredentialsException , DuplicateUserException;

    User signinUser( User user );

    boolean isUserDuplicate( User user );

    List<User> getAllUsers();

    List<User> getUsersByRoleId( Integer roleId );

    User getUserByUserId( String userId );

}
