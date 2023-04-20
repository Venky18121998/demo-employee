package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import com.example.demo.vo.ResponseTemp;

@RestController

public class StudentController {
	@Autowired
	StudentService studentService;

	// post the new user to the data base
	@PostMapping("/save")

	public Student saveDetails(@RequestBody Student student) {
		Student nvr = studentService.save(student);
		return nvr;

	}

	// To get the all the users as a list
	@GetMapping("/get")
	public List<Student> getDetails() {
		List<Student> nsr = studentService.findAll();
		return nsr;

	}

	// To get the perticular user only from db
	@GetMapping("/get/{Id}")
	public Optional<Student> findBy(@PathVariable Long Id) {
		Optional<Student> nmr = studentService.findById(Id);
		return nmr;
	}

	// Editing the particular person details
	@PutMapping("/update/{Id}")
	public Student newUpdate(@RequestBody Student stud, @PathVariable Long Id) {
		return studentService.findBy(stud, Id);

	}

	// delecting the user
	@DeleteMapping("/delect/{Id}")
	public void DelectBy(@PathVariable Long Id) {
		studentService.delectBy(Id);

	}
	
	@GetMapping("/hello/{Id}")
	public ResponseTemp getUser(@PathVariable Long Id) {
		return studentService.getUserWith(Id);
		
	}

}
