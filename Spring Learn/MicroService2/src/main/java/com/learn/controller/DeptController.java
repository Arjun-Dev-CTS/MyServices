package com.learn.controller;

import com.learn.dao.Department;
import com.learn.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ms2")
@RestController
public class DeptController {
	 
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/create")
	public ResponseEntity<String> ViewData(
		@RequestParam int DeptId,
		@RequestParam String DeptName){
			Department department = new Department();
			department.setDeptId(DeptId);
			department.setDeptName(DeptName);
			
			return new ResponseEntity<>(departmentService.displayData(department), HttpStatus.OK);
	}
	
	@GetMapping("/info")
    public String info() {
    	return "MicroService2";
    }
	
}
