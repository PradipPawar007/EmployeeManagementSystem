package com.program.Services;

import java.util.List;

import com.program.entity.Employee;

public interface EmpServices 
{ 
	public  List<Employee> getAllEmp();
    public Employee getEmp (int EmpId);
    public Employee addEmp (Employee enployee);
    public Employee UpdateEmpData(Employee enployee);
    public void DeleteEmp(int EmpId);
}
