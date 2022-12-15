package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.StudentsDoAssignmentsRepository;
import com.lio.moeduhouseapi.service.interfaces.StudentDoAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentDoAssignmentService")
public class StudentDoAssignmentServiceImpl  implements StudentDoAssignmentService {

    private StudentsDoAssignmentsRepository studentsDoAssignmentsRepo;

    @Autowired
    public StudentDoAssignmentServiceImpl( StudentsDoAssignmentsRepository studentsDoAssignmentsRepo ){
        this.studentsDoAssignmentsRepo = studentsDoAssignmentsRepo;
    }

}
