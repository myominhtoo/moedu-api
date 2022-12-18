package com.lio.moeduhouseapi.controller.v1.user;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateUserException;
import com.lio.moeduhouseapi.exception.custom.Index.InvalidUserIdExcepton;
import com.lio.moeduhouseapi.model.dto.HttpResponse;
import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.model.entity.UserMuteRingtone;
import com.lio.moeduhouseapi.service.implementation.JwtProviderImpl;
import com.lio.moeduhouseapi.service.implementation.UserMuteRingtoneServiceImpl;
import com.lio.moeduhouseapi.service.implementation.UserServiceImpl;
import com.lio.moeduhouseapi.util.HttpHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/api/v1" )
public class UserController {

    private UserServiceImpl userService;
    private JwtProviderImpl jwtProvider;
    private UserMuteRingtoneServiceImpl userMuteRingtoneService;

    @Autowired
    public UserController(
            UserServiceImpl userService ,
            JwtProviderImpl jwtProvider , 
            UserMuteRingtoneServiceImpl userMuteRingtoneService ){
        this.userService = userService;
        this.jwtProvider = jwtProvider;
        this.userMuteRingtoneService = userMuteRingtoneService;
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

    /*
     * updating user information
     */
    @PutMapping( value = "/users/{userId}" )
    public ResponseEntity<HttpResponse<User>> putUpdateUser(  @PathVariable("userId") String userId ,  @RequestBody User user ) throws BadCredentialsException, InvalidUserIdExcepton, DuplicateUserException{
        User updatedUser = this.userService.updateUser(user);
        return ResponseEntity.ok().body(
            new HttpHelper<User>().getHttpResponse( updatedUser != null , "Successfully Updated!", "Failed to update user!", updatedUser )
        );
    }
    
    /*
     * to mute ringtones
     */
    @PutMapping( value = "/users/{userId}/mute" )
    public ResponseEntity<HttpResponse<UserMuteRingtone>> putToggleMute( @PathVariable("userId") String userId ) throws InvalidUserIdExcepton{
       
        UserMuteRingtone userMuteRingtone = this.userMuteRingtoneService.toggleMuteRingtoneByUserId(userId);
        return ResponseEntity.ok().body(
            new HttpHelper<UserMuteRingtone>()
               .getHttpResponse( userMuteRingtone != null , "Successfully Done!", "Failed to toggle mute!", userMuteRingtone )
        );

    }
    

}
