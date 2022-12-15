package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.IncomeSalaryRepository;
import com.lio.moeduhouseapi.service.interfaces.IncomeSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("incomeSalaryService")
public class IncomeSalaryServiceImpl implements IncomeSalaryService {

    private IncomeSalaryRepository incomeSalaryRepo;

    @Autowired
    public IncomeSalaryServiceImpl( IncomeSalaryRepository incomeSalaryRepo ){
        this.incomeSalaryRepo = incomeSalaryRepo;
    }

}
