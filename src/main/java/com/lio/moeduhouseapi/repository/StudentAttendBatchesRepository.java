package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.StudentsAttendBatches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentAttendBatchesRepository")
public interface StudentAttendBatchesRepository extends JpaRepository<StudentsAttendBatches,Integer> {
}
