package com.program.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int EmpId;
	private String EmpName;
	private String JobRole;
	private int DepId;
	private long PhNo;
	private double Salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String jobRole, int depId, long phNo, double salary) {
		super();
		EmpId = empId;
		EmpName = empName;
		JobRole = jobRole;
		DepId = depId;
		PhNo = phNo;
		Salary = salary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getJobRole() {
		return JobRole;
	}

	public void setJobRole(String jobRole) {
		JobRole = jobRole;
	}

	public int getDepId() {
		return DepId;
	}

	public void setDepId(int depId) {
		DepId = depId;
	}

	public long getPhNo() {
		return PhNo;
	}

	public void setPhNo(long phNo) {
		PhNo = phNo;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", JobRole=" + JobRole + ", DepId=" + DepId
				+ ", PhNo=" + PhNo + ", Salary=" + Salary + "]";
	}

}
