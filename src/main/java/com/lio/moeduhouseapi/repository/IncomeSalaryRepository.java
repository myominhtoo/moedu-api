package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.IncomeSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("incomeSalaryRepository")
public interface IncomeSalaryRepository extends JpaRepository<IncomeSalary,Integer> {
}
