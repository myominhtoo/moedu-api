package com.lio.moeduhouseapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lio.moeduhouseapi.model.entity.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role,Integer> {
    
}
