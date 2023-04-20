package com.example.demo.vo;

import com.example.demo.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemp {

	 private Student student;
	 private EmpInformation empInformation;
}
