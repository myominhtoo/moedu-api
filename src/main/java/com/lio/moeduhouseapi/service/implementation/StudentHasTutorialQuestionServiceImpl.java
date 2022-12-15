package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.StudentHasTutorialQuestionRepository;
import com.lio.moeduhouseapi.service.interfaces.StudentHasTutorialQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentHasTutorialQuestionService")
public class StudentHasTutorialQuestionServiceImpl implements StudentHasTutorialQuestionService  {

    private StudentHasTutorialQuestionRepository studentHasTutorialQuestionRepo;

    @Autowired
    private StudentHasTutorialQuestionServiceImpl( StudentHasTutorialQuestionRepository studentHasTutorialQuestionRepo ){
        this.studentHasTutorialQuestionRepo = studentHasTutorialQuestionRepo;
    }

}
