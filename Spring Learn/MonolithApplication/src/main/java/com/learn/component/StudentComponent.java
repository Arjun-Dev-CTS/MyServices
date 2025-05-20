package com.learn.component;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.learn.model.Student;

@Component
public class StudentComponent {
	
	public static List<Student> ECE_Students = new ArrayList<>();
	public static List<Student> EEE_Students = new ArrayList<>();
	public static List<Student> CSE_Students = new ArrayList<>();
	public static List<Student> Other_Students = new ArrayList<>();
	
}
