package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.NotificationRepository;
import com.lio.moeduhouseapi.service.interfaces.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("notificationService")
public class NotificationServiceImpl implements NotificationService {

    private NotificationRepository notificationRepo;

    @Autowired
    public NotificationServiceImpl( NotificationRepository notificationRepo ){
        this.notificationRepo = notificationRepo;
    }

}
