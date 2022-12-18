package com.lio.moeduhouseapi.service.interfaces;

import com.lio.moeduhouseapi.exception.custom.Index.InvalidUserIdExcepton;
import com.lio.moeduhouseapi.model.entity.UserMuteRingtone;

public interface UserMuteRingtoneService {
    
    UserMuteRingtone toggleMuteRingtoneByUserId( String userId ) throws InvalidUserIdExcepton;

}
