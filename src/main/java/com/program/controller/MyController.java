package com.program.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.program.Services.EmpServices;
import com.program.entity.Employee;

@RestController
public class MyController 
{
	@Autowired
	private EmpServices empServices;
	
	@GetMapping("/AllEmp")
	public List<Employee> getAllEmp()
	{
		return this.empServices.getAllEmp();
	}
	@GetMapping("/Emp/{EmpID}")
    public Employee getEmp (@PathVariable String EmpId)
    {
		return this.empServices.getEmp(Integer.parseInt(EmpId));

    }
	@PostMapping("/AddEmp")
    public Employee addEmp (@RequestBody Employee employee)
    {
		return this.empServices.addEmp(employee);

    }
	@PutMapping("/Update")
    public Employee UpdateEmpData(@RequestBody Employee employee)
    {
		return this.empServices.UpdateEmpData(employee);

    }
	@DeleteMapping("/Delete/{EmpId}")
    public void DeleteEmp(@PathVariable String EmpId)
    {
      this.empServices.DeleteEmp(Integer.parseInt(EmpId));
    }
}
