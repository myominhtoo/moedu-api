package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,String> {
    @Query( value = "SELECT * FROM users u LEFT JOIN roles r ON u.role_id = r.id  WHERE  u.role_id = ?1 " , nativeQuery = true )
    List<User> findUsersByRoleId( Integer roleId );

    @Query( value = "SELECT * FROM users u WHERE u.email = ?1 " , nativeQuery = true )
    Optional<User> findByEmail( String email );

}
