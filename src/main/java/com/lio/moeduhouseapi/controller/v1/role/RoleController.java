package com.lio.moeduhouseapi.controller.v1.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lio.moeduhouseapi.service.implementation.RoleServiceImpl;

@RestController
@RequestMapping( name =  "/api/v1" )
public class RoleController {
    
    private RoleServiceImpl roleService;

    @Autowired
    public RoleController( RoleServiceImpl roleService ){
        this.roleService = roleService;
    }

}
