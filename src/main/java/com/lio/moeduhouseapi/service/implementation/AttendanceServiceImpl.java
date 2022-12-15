package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.AttendanceRepository;
import com.lio.moeduhouseapi.service.interfaces.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService {

    private AttendanceRepository attendanceRepo;

    @Autowired
    public AttendanceServiceImpl( AttendanceRepository attendanceRepo ){
        this.attendanceRepo = attendanceRepo;
    }

}
