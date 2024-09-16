package com.sushma.docker.employeecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.docker.employeeEntity.Employee;
import com.sushma.docker.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/EmployeeTable")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeService;
	
	
	@GetMapping("/codedecode")
	public void codeDecodeGetMethod() {
		
		System.out.println("my server port is 8080");
		
	}
	
	@PostMapping("/add")
	public Employee addEmployee(Employee e) {
		
		Employee emp=employeeService.addEmployee(e);
		return emp;
	}
	
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployee(){
		
		List<Employee> e=employeeService.getAllEmployees();
		return e;
	}
	
	
	@GetMapping("/getById/{id}")
	public Employee getById(@PathVariable ("id") long id) {
		
		Employee e=employeeService.getById(id);
		return e;
		
	}
	
	
  @DeleteMapping("/deleteById/{id}")
  public void deleteById(@PathVariable ("id") long id) {
		
		employeeService.deleteById(id);
		
		
	}
	
		
	
	

}
