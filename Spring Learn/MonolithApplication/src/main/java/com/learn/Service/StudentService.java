package com.learn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.component.StudentComponent;
import com.learn.model.Student;

@Service
public class StudentService {
	
	public void AddStudent(Student student) {
		if(student.getDept().equals("ECE"))
			StudentComponent.ECE_Students.add(student);
		else if(student.getDept().equals("EEE"))
			StudentComponent.EEE_Students.add(student);
		else if(student.getDept().equals("CSE"))
			StudentComponent.CSE_Students.add(student);
		else
			StudentComponent.Other_Students.add(student);
	}
	
	public List<Student> GetAllStudents() {
		List<Student> AllStudents = new ArrayList<>();
		AllStudents.addAll(StudentComponent.ECE_Students);
		AllStudents.addAll(StudentComponent.EEE_Students);
		AllStudents.addAll(StudentComponent.CSE_Students);
		AllStudents.addAll(StudentComponent.Other_Students);
		return AllStudents;
	}
	
	public Student GetStudentByRoll(int roll) {
		List<Student> AllStudents = new ArrayList<>();
		AllStudents.addAll(StudentComponent.ECE_Students);
		AllStudents.addAll(StudentComponent.EEE_Students);
		AllStudents.addAll(StudentComponent.CSE_Students);
		AllStudents.addAll(StudentComponent.Other_Students);
		
		return AllStudents.stream()
				.filter((t) -> t.getRollNo() == roll)
				.findFirst()
				.orElse(null);
		
	}
	
}
