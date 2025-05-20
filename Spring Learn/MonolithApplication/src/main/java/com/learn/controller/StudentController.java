package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Service.StudentService;
import com.learn.model.Student;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/Add")
	public ResponseEntity<Void> AddStudentService(@RequestBody Student student) {
		studentService.AddStudent(student);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/GetAllStudents")
    public ResponseEntity<List<Student>> GetAllStudentService() {
		List<Student> students = studentService.GetAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> GetStudentByRollService(int id){
		return new ResponseEntity<>(studentService.GetStudentByRoll(id),HttpStatus.OK);
		
	}
}
