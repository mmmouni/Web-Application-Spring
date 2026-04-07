package com.sathya;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("id2")
@Scope("prototype")
public class EmployeeBean {
	private int empId;
	private String empName;
	public EmployeeBean() {
		System.out.println("This is a Employee");
	}
	public int getEmpId() {
		return empId;
	}
	@Value("120")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	@Value("Mouni")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
		
	}


