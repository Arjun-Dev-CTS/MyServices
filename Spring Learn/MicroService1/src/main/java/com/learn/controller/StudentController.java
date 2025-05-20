package com.learn.controller;

import com.learn.dao.Student;
import com.learn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms1")
public class StudentController {

    @Autowired
    StudentService studentservice;

    @GetMapping("/create")
    public ResponseEntity<String> viewData(
        @RequestParam int rollNo,
        @RequestParam String name,
        @RequestParam String dept) {

        Student student = new Student();
        student.setRollNo(rollNo);
        student.setName(name);
        student.setDept(dept);

        return new ResponseEntity<>(studentservice.displayData(student), HttpStatus.OK);
    }
    
    @GetMapping("/info")
    public String info() {
    	return "MicroService1";
    }
}
