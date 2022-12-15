package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
