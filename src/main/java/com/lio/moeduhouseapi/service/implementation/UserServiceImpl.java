package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.repository.UserRepository;
import com.lio.moeduhouseapi.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user){
        return null;
    }

    @Override
    public User signinUser(User user){
        return null;
    }
}
