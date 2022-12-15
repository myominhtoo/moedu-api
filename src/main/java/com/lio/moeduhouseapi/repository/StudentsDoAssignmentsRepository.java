package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.StudentsDoAssignments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentsDoAssignmentsRepository")
public interface StudentsDoAssignmentsRepository extends JpaRepository<StudentsDoAssignments,Integer> {
}
