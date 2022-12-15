package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.TeachersTeachBatchesRepository;
import com.lio.moeduhouseapi.service.interfaces.TeacherTeachBatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherTeachBatchesService")
public class TeacherTeachBatchesServiceImpl implements TeacherTeachBatchesService  {

    private TeachersTeachBatchesRepository teacherTeachBatchesRepo;

    @Autowired
    public TeacherTeachBatchesServiceImpl( TeachersTeachBatchesRepository teachersTeachBatchesRepo  ){
        this.teacherTeachBatchesRepo = teachersTeachBatchesRepo;
    }

}
