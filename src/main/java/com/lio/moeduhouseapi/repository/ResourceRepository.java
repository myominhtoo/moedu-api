package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("resourceRepository")
public interface ResourceRepository extends JpaRepository<Resource,Integer> {
}
