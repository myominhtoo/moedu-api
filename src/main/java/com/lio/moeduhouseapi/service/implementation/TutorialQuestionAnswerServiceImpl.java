package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.TutorialQuestionAnswerRepository;
import com.lio.moeduhouseapi.service.interfaces.TutorialQuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tutorialQuestionAnswerService")
public class TutorialQuestionAnswerServiceImpl implements TutorialQuestionAnswerService {

    private TutorialQuestionAnswerRepository tutorialQuestionAnswerRepo;

    @Autowired
    public TutorialQuestionAnswerServiceImpl( TutorialQuestionAnswerRepository tutorialQuestionAnswerRepo ){
        this.tutorialQuestionAnswerRepo = tutorialQuestionAnswerRepo;
    }

}
