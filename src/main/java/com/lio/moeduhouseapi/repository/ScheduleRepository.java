package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("scheduleRepository")
public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {
}
