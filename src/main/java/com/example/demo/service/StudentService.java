package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;
import com.example.demo.vo.ResponseTemp;

public interface StudentService {
	public Student save(Student student);

	public List<Student> findAll();

	public Optional<Student> findById(Long Id);

	public Student findBy(Student stu, Long Id);
	
//	public void deleteId(Long Id);

	public void delectBy(Long Id);

	public ResponseTemp getUserWith(Long id);

}
