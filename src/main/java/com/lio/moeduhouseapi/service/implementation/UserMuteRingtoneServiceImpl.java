package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.model.entity.UserMuteRingtone;
import com.lio.moeduhouseapi.repository.UserMuteRingtoneRepository;
import com.lio.moeduhouseapi.service.interfaces.UserMuteRingtoneService;
import com.lio.moeduhouseapi.exception.custom.Index.InvalidUserIdExcepton;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userMuteRingtoneService")
public class UserMuteRingtoneServiceImpl implements UserMuteRingtoneService {

    private UserMuteRingtoneRepository userMuteRingtoneRepo;
    private UserServiceImpl userService;

    @Autowired
    public UserMuteRingtoneServiceImpl( 
      UserMuteRingtoneRepository userMuteRingtoneRepo , 
      UserServiceImpl userService
    ){
        this.userMuteRingtoneRepo = userMuteRingtoneRepo;
        this.userService =  userService;
    }

    @Override
    public UserMuteRingtone toggleMuteRingtoneByUserId( String userId) throws InvalidUserIdExcepton {

         User targetUser = this.userService.getUserByUserId(userId);

         if( targetUser ==  null ){
            throw new InvalidUserIdExcepton("Invalid User Id!");
         }

         Optional<UserMuteRingtone> savedUserMuteRingtone = this.userMuteRingtoneRepo.findByUserId(userId);

         if( savedUserMuteRingtone.isEmpty()){
            UserMuteRingtone userMuteRingtone = new UserMuteRingtone();
            userMuteRingtone.setUser(targetUser);
            return this.userMuteRingtoneRepo.save(userMuteRingtone);
         }

         try{
            this.userMuteRingtoneRepo.deleteById(savedUserMuteRingtone.get().getId());
         }catch( Exception e ){
            return null;
         }
         return savedUserMuteRingtone.get();

    }

}
