package com.learn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Department {
	
	@Id
	private int Id;
	private String DepartmentName;
	private int Fees;
	
}
