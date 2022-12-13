package com.lio.moeduhouseapi.service.interfaces;

import java.util.List;

import com.lio.moeduhouseapi.model.entity.User;

public interface EmailService {
    
    String sendToUser( User user );

    String [] sendToUsers( List<User> users );

}
