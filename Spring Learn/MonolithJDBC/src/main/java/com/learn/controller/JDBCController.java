package com.learn.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Student;
import com.learn.service.StudentService;

@RestController
@RequestMapping("/Student")
public class JDBCController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllStudent(){
		return new ResponseEntity<>(studentService.getAllStudent(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable int id){
		return new ResponseEntity<>(studentService.getStudentById(id),HttpStatus.OK);
	}
	
	@GetMapping("/getAllDeptName")
	public ResponseEntity<Set<String>> getAllDeptName(){
		List<Student> AllStudent = studentService.getAllStudent();
		Set<String> set = new HashSet<>();
		AllStudent.stream().forEach((t)->set.add(t.getDepartment().getDepartmentName()));
		return new ResponseEntity<>(set,HttpStatus.OK);
	}
	
}
