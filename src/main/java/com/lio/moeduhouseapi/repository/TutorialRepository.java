package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tutorialRepository")
public interface TutorialRepository extends JpaRepository<Tutorial,Integer> {
}
