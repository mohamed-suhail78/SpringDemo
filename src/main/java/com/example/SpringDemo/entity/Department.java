package com.example.SpringDemo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class  Department{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long departmentid;
	private String departmentname;
	private String departmentaddress;
	private int departmentCode;
	
	
	public Long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentaddress() {
		return departmentaddress;
	}
	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}
	public int getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}
	public Department(Long departmentid, String departmentname, String departmentaddress, int departmentCode) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.departmentaddress = departmentaddress;
		this.departmentCode = departmentCode;
	}
	
}