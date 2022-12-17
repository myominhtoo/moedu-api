package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.model.dto.CustomUserDetails;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.repository.UserRepository;
import com.lio.moeduhouseapi.service.interfaces.UserService;
import com.lio.moeduhouseapi.util.RandomGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDateTime;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService , UserDetailsService {

    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(
            UserRepository userRepository ,
            BCryptPasswordEncoder passwordEncoder
    ){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public List<User> getAllUsers() {
       return this.userRepository.findAll();
    }

    @Override
    public List<User> getUsersByRoleId(Integer roleId) {
        return this.userRepository.findUsersByRoleId(roleId);
    }
    @Override
    public User createUser(User user) throws DuplicateUserException {
        user.setId(RandomGenerator.generateId(user.getRole()));
        if( this.isUserDuplicate(user)){
            throw new DuplicateUserException("Duplcate user!");
        }
        
        user.setCreatedDate(LocalDateTime.now());
        user.setUpdatedDate(LocalDateTime.now());
        user.setEnable(false);
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        user.setVerifyCode(RandomGenerator.generateId(user.getRole()));

        return this.userRepository.save(user);
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
       return (
               this.userRepository.findByEmail(user.getEmail()).isPresent() ||
                       this.userRepository.findById(user.getId()).isPresent()
       );
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
