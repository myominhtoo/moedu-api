package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.ScheduleRepository;
import com.lio.moeduhouseapi.service.interfaces.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

    private ScheduleRepository scheduleRepo;

    @Autowired
    private ScheduleServiceImpl(ScheduleRepository scheduleRepo ){
        this.scheduleRepo = scheduleRepo;
    }

}
