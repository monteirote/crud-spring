package com.vinicius.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinicius.crudspring.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
