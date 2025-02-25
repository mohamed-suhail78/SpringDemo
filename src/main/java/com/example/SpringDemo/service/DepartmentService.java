package com.example.SpringDemo.service;

import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemo.entity.Department;

@RestController
public interface DepartmentService {

	 public Department saveDepartment(Department department);

 

}
