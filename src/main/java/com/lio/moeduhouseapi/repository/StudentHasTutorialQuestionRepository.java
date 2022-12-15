package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.StudentHasTutorialQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentHasTutorialQuestionRepository")
public interface StudentHasTutorialQuestionRepository extends JpaRepository<StudentHasTutorialQuestion,Integer> {
}
