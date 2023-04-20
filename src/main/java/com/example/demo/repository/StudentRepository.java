package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {

}
