package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("assignmentRepository")
public interface AssignmentRepository extends JpaRepository<Assignment,Integer> { }
