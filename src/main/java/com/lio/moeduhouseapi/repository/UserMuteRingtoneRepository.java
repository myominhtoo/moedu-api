package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.UserMuteRingtone;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userMuteRingtoneRepository")
public interface UserMuteRingtoneRepository extends JpaRepository<UserMuteRingtone,Integer> {

    Optional<UserMuteRingtone> findByUserId( String userId);

}
