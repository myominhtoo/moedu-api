package com.lio.moeduhouseapi.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.EmailService;

@Service("emailService")
public class EmailServiceImpl implements EmailService {

    private JavaMailSender javaMailSender;

    @Autowired
    public EmailServiceImpl( JavaMailSender javaMailSender ){
        this.javaMailSender = javaMailSender;
    }

    @Override
    public String sendToUser(User user) {
        // TODO Auto-generated method stub
        return null;  
    }

    @Override
    public String[] sendToUsers(List<User> users) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
