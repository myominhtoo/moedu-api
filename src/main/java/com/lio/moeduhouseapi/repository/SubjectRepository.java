package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("subjectRepository")
public interface SubjectRepository extends JpaRepository<Subject,Integer> {
}
