package com.student.crudapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.crudapi.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
