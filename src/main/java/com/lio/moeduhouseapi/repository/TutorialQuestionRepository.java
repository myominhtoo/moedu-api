package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.TutorialQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tutorialQuestionRepository")
public interface TutorialQuestionRepository extends JpaRepository<TutorialQuestion,Integer> {
}
