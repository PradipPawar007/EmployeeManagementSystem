package com.program.Services;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.entity.Employee;
import com.program.repositoy.EmpDao;
@Service
public class EmpService implements EmpServices
{
	@Autowired
 private EmpDao empDao;
	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return  empDao.findAll();
	}

	@Override
	public Employee getEmp(int EmpId) {
		// TODO Auto-generated method stub
		return empDao.getOne(EmpId);
	}

	
	@Override
	public Employee addEmp(Employee employee) 
	{
		// TODO Auto-generated method stub
		return empDao.save(employee) ;
	}

	@Override
	public Employee UpdateEmpData(Employee employee)
	{
		// TODO Auto-generated method stub
		return empDao.save(employee);
	}

	@Override
	public void DeleteEmp(int EmpId) 
	{
		Employee entity=empDao.getOne(EmpId);
		empDao.delete(entity);
	}

	

}
