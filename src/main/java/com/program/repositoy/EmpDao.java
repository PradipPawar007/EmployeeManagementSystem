package com.program.repositoy;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.entity.Employee;

public interface EmpDao extends JpaRepository<Employee, Integer> 
{
	

}
