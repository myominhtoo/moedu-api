package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("attendanceRepository")
public interface AttendanceRepository extends JpaRepository<Attendance,Integer> {
}
