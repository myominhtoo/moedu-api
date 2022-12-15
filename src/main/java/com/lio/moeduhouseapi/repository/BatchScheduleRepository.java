package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.BatchSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("batchScheduleRepository")
public interface BatchScheduleRepository extends JpaRepository<BatchSchedule,Integer> {
}
