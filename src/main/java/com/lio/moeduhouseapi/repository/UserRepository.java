package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,String> {
}
