package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.UserMuteRingtoneRepository;
import com.lio.moeduhouseapi.service.interfaces.UserMuteRingtoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userMuteRingtoneService")
public class UserMuteRingtoneServiceImpl implements UserMuteRingtoneService {

    private UserMuteRingtoneRepository userMuteRingtoneRepo;

    @Autowired
    public UserMuteRingtoneServiceImpl( UserMuteRingtoneRepository userMuteRingtoneRepo ){
        this.userMuteRingtoneRepo = userMuteRingtoneRepo;
    }

}
