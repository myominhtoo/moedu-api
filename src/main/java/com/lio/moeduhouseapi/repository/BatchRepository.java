package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("batchRepository")
public interface BatchRepository extends JpaRepository<Batch,Integer> {
}
