package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.BatchRepository;
import com.lio.moeduhouseapi.service.interfaces.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("batchService")
public class BatchServiceImpl implements BatchService {

    private BatchRepository batchRepo;

    @Autowired
    public BatchServiceImpl( BatchRepository batchRepo ){
        this.batchRepo = batchRepo;
    }

}
