package com.lio.moeduhouseapi.controller.v1.user;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.implementation.JwtProviderImpl;
import com.lio.moeduhouseapi.service.implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/api/v1" )
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

    /*
     * getting all users or filtered with roleId
     */
    @GetMapping( value = "/users" )
    public List<User> getUsers( @RequestParam( value = "roleId" , required = false ) Integer roleId ){
        if(roleId == null){
            return this.userService.getAllUsers();
        }
        return this.userService.getUsersByRoleId(roleId);
    }
    
}
