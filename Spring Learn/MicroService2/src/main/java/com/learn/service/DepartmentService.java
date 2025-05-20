package com.learn.service;

import com.learn.dao.Department;

@org.springframework.stereotype.Service
public class DepartmentService {
	public String displayData(Department department) {
		return "Department Info : \n 1.Dept Name : "+department.getDeptName()+"\n 2.Dept Id : "+department.getDeptId();
	}
	
}
