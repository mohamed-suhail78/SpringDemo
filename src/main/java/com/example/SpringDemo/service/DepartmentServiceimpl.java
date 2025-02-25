package com.example.SpringDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDemo.Repositories.DepartmentRepository;
import com.example.SpringDemo.entity.Department;

@Service
public class DepartmentServiceimpl implements DepartmentService {
	@Autowired 
	public DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

}
