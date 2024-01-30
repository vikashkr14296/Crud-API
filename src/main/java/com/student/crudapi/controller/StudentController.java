package com.student.crudapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.crudapi.model.Student;
import com.student.crudapi.repo.StudentRepo;

@RestController
@RequestMapping("/apis")
public class StudentController {
	
	@Autowired
	StudentRepo stdRepo;
	
	@PostMapping("/students")
	public String createNewStudent(@RequestBody Student student) {
		stdRepo.save(student);
		return "New Student Created Successfully";
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> stdList = new ArrayList<>();
		stdRepo.findAll().forEach(stdList::add);
		return new ResponseEntity<List<Student>>(stdList,HttpStatus.OK);
	}
	
	@GetMapping("/students/{std_id}")
	public ResponseEntity<Student> getStudentById(@PathVariable long std_id){
		Optional<Student> std = stdRepo.findById(std_id);
		if (std.isPresent()) {
			return new ResponseEntity<Student>(std.get(), HttpStatus.FOUND);
		}else {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/students/{std_id}")
	public String updateStudentById(@PathVariable long std_id, @RequestBody Student student) {
		Optional<Student> std = stdRepo.findById(std_id);
		if (std.isPresent()) {
			Student existStd = std.get();
			existStd.setStd_name(student.getStd_name());
			existStd.setStd_rollno(student.getStd_rollno());
			existStd.setStd_course(student.getStd_course());
			existStd.setStd_age(student.getStd_age());
			existStd.setStd_city(student.getStd_city());
			
			return "Student Details for Id : " + std_id + "Has Been Updated Successfully.";
		}else {
			return "Student Details for Id : " + std_id + " is Not Found.";
		}
	}

}
