package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.AssignmentRepository;
import com.lio.moeduhouseapi.service.interfaces.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("assignmentService")
public class AssignmentServiceImpl implements AssignmentService {

    private AssignmentRepository assignmentRepo;

    @Autowired
    public AssignmentServiceImpl( AssignmentRepository assignmentRepo ){
        this.assignmentRepo = assignmentRepo;
    }

}
