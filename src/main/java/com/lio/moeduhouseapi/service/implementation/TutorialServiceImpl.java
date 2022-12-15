package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.TutorialRepository;
import com.lio.moeduhouseapi.service.interfaces.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tutorialService")
public class TutorialServiceImpl implements TutorialService {

    private TutorialRepository tutorialRepo;

    @Autowired
    public TutorialServiceImpl( TutorialRepository tutorialRepo ){
        this.tutorialRepo = tutorialRepo;
    }

}
