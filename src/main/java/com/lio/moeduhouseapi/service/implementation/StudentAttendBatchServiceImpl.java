package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.StudentAttendBatchesRepository;
import com.lio.moeduhouseapi.service.interfaces.StudentAttendBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentAttendBatchService")
public class StudentAttendBatchServiceImpl implements StudentAttendBatchService  {

    private StudentAttendBatchesRepository studentAttendBatchRepo;

    @Autowired
    public StudentAttendBatchServiceImpl( StudentAttendBatchesRepository studentAttendBatchesRepo  ){
        this.studentAttendBatchRepo = studentAttendBatchesRepo;
    }

}
