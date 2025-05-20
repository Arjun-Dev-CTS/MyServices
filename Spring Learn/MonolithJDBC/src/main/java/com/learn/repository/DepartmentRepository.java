package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
