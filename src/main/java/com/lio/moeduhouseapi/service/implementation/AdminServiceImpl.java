package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.model.entity.Role;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.AdminService;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    private UserRepository userRepository;
    private UserServiceImpl userService;

    @Autowired
    public AdminServiceImpl( 
        UserRepository userRepository , 
        UserServiceImpl userService
    ){
        this.userRepository = userRepository;
        this.userService =  userService;
    }

    @Override
    public User createAdmin(User admin) throws DuplicateUserException {
        Role roleAdmin = new Role();
        roleAdmin.setId(1);
        admin.setRole(roleAdmin);

        return this.userService.createUser(admin);
    }

    @Override
    public List<User> getAllAdmins() {
        return this.userRepository.findUsersByRoleId(1);
    }
}
