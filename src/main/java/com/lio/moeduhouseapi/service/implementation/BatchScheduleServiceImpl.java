package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.BatchScheduleRepository;
import com.lio.moeduhouseapi.service.interfaces.BatchScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("batchScheduleService")
public class BatchScheduleServiceImpl implements BatchScheduleService {

    private BatchScheduleRepository batchScheduleRepo;

    @Autowired
    public BatchScheduleServiceImpl( BatchScheduleRepository batchScheduleRepo ){
        this.batchScheduleRepo = batchScheduleRepo;
    }

}
