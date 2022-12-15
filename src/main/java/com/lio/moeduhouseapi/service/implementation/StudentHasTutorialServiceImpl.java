package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.StudentHasTutorialRepository;
import com.lio.moeduhouseapi.service.interfaces.StudentHasTutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentHasTutorialService")
public class StudentHasTutorialServiceImpl implements StudentHasTutorialService {

    private StudentHasTutorialRepository studentHasTutorialRepo;

    @Autowired
    public StudentHasTutorialServiceImpl( StudentHasTutorialRepository studentHasTutorialRepo ){
        this.studentHasTutorialRepo = studentHasTutorialRepo;
    }

}
