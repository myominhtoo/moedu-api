package com.lio.moeduhouseapi.service.implementation;


import com.lio.moeduhouseapi.repository.SubjectRepository;
import com.lio.moeduhouseapi.service.interfaces.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {

    private SubjectRepository subjectRepo;

    @Autowired
    public SubjectServiceImpl( SubjectRepository subjectRepo ){
        this.subjectRepo = subjectRepo;
    }

}
