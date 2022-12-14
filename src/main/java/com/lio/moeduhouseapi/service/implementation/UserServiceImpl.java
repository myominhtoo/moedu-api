package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.model.dto.CustomUserDetails;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.repository.UserRepository;
import com.lio.moeduhouseapi.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService , UserDetailsService {

    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
       return this.userRepository.findAll();
    }

    @Override
    public List<User> getUsersByRoleId(Integer roleId) {
        return this.userRepository.findUsersByRoleId(roleId);
    }

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public RedirectView verifyEmail(String email) {
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

    @Override
    public boolean isUserDuplicate(User user){
        return false;
    }

    /*
     * username means email address
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User savedUser = this.userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("Invalid User!"));
        return new CustomUserDetails(savedUser);
    }
}
