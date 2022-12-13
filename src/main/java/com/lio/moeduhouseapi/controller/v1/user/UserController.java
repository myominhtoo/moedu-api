package com.lio.moeduhouseapi.controller.v1.user;

import com.lio.moeduhouseapi.service.implementation.JwtProviderImpl;
import com.lio.moeduhouseapi.service.implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( name = "/api/v1" )
public class UserController {

    private UserServiceImpl userService;
    private JwtProviderImpl jwtProvider;

    @Autowired
    public UserController(
            UserServiceImpl userService ,
            JwtProviderImpl jwtProvider ){
        this.userService = userService;
        this.jwtProvider = jwtProvider;
    }
    
}
