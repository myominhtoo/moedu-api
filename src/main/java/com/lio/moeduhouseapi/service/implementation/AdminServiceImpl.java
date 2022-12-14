package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.AdminService;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    private UserRepository userRepository;

    @Autowired
    public AdminServiceImpl( UserRepository userRepository ){
        this.userRepository = userRepository;
    }

    @Override
    public User createAdmin(User admin) {
        return null;
    }

    @Override
    public List<User> getAllAdmins() {
        return this.userRepository.findUsersByRoleId(1);
    }
}
