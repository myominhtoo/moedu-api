package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.TeachersTeachBatches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("teachersTeachBatchesRepository")
public interface TeachersTeachBatchesRepository extends JpaRepository<TeachersTeachBatches,Integer> {
}
