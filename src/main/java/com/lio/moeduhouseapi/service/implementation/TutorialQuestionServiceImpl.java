package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.TutorialQuestionRepository;
import com.lio.moeduhouseapi.service.interfaces.TutorialQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tutorialQuestionService")
public class TutorialQuestionServiceImpl implements TutorialQuestionService {

    private TutorialQuestionRepository tutorialQuestionRepo;

    @Autowired
    public TutorialQuestionServiceImpl( TutorialQuestionRepository tutorialQuestionRepo ){
        this.tutorialQuestionRepo = tutorialQuestionRepo;
    }

}
