package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.TutorialQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tutorialQuestionAnswerRepository")
public interface TutorialQuestionAnswerRepository extends JpaRepository<TutorialQuestionAnswer,Integer> {
}
