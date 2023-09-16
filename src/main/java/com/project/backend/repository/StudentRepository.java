package com.project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
