package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.StudentHasTutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentHasTutorialRepository")
public interface StudentHasTutorialRepository extends JpaRepository<StudentHasTutorial,Integer> {
}
