package com.lio.moeduhouseapi.controller.v1.user.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lio.moeduhouseapi.model.dto.HttpResponse;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.implementation.AdminServiceImpl;

@RestController
@RequestMapping( value = "/api/v1" )
public class AdminController {
    
    private AdminServiceImpl adminService;

    public AdminController( AdminServiceImpl adminService ){
        this.adminService = adminService;
    }

    /*
     * create new admin
     */
    @PostMapping( value = "/admins" )
    public HttpResponse<User> createNewAdmin( @RequestBody User admin ){
        return null;
    }
 
}
