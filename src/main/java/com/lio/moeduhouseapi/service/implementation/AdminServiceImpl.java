package com.lio.moeduhouseapi.service.implementation;

import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Override
    public User createAdmin(User admin) {
        return null;
    }
    
}
