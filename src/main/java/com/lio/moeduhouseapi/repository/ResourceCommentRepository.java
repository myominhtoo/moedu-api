package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.ResourceComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("resourceCommentRepository")
public interface ResourceCommentRepository extends JpaRepository<ResourceComment,Integer> {
}
