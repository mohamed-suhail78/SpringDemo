package com.example.SpringDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemo.entity.Department;
import com.example.SpringDemo.service.DepartmentService;

@RestController
public class Departmentcontroller {
	@Autowired
	 private DepartmentService departmentservice;
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
	return departmentservice.saveDepartment(department);
	
	}
}
