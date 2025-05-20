package com.learn.service;

import com.learn.dao.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public String displayData(Student student) {
        return "Data Created with Student \n 1.Name : " + student.getName() +
               "\n 2.Roll No : " + student.getRollNo() +
               "\n 3.Department : " + student.getDept();
    }
}
