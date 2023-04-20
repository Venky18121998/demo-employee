package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.vo.EmpInformation;
import com.example.demo.vo.ResponseTemp;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Student save(Student student) {
		Student hope = studentRepository.save(student);
		return hope;
	}

	@Override
	public List<Student> findAll() {
		List<Student> nope = studentRepository.findAll();
		return nope;
	}

	@Override
	public Optional<Student> findById(Long Id) {
		Optional<Student> dup = Optional.ofNullable(studentRepository.findById(Id).get());
		return dup;
	}

	@Override
	public Student findBy(Student stu, Long Id) {
		Student niba = studentRepository.findById(Id).get();
		niba.setFirstName(stu.getFirstName());
		niba.setLastName(stu.getLastName());
		niba.setEmail(stu.getEmail());
		Student mk = studentRepository.save(niba);
		return mk;
	}

	@Override
	public void delectBy(Long Id) {
		studentRepository.deleteById(Id);
		
	}

	@Override
	public ResponseTemp getUserWith(Long id) {
		// TODO Auto-generated method stub
		ResponseTemp rt = new ResponseTemp();
		Student student = studentRepository.findById(id).get();
		EmpInformation emp = restTemplate.getForObject( "http://EMPINFORMATION/getbyID/"+student.getEmpId(), EmpInformation.class);
		rt.setStudent(student);
		rt.setEmpInformation(emp);
		
		return rt;
	}

//	@Override
//	public void deleteId(Long Id) {
//		studentRepository.deleteById(Id);
//		
//		
//	}



}
