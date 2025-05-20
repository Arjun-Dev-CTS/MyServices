package com.learn.model;

public class Student {
	
	private int RollNo;
	private String Name;
	private String Dept;

	public Student() {
		super();
	}

	public Student(int rollNo, String name, String dept) {
		super();
		RollNo = rollNo;
		Name = name;
		Dept = dept;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

}
