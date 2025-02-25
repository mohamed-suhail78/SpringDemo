package com.example.SpringDemo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDemo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	

}
