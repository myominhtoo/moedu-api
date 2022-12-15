package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("notificationRepository")
public interface NotificationRepository extends JpaRepository<Notification,Integer> {
}
