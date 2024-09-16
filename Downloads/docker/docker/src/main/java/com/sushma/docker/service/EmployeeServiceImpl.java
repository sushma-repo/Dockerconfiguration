package com.sushma.docker.service;

import java.util.List;

import com.sushma.docker.employeeEntity.Employee;

public interface EmployeeServiceImpl {

	

	Employee addEmployee(Employee e);

	List<Employee> getAllEmployees();

	Employee getById(long id);

	void deleteById(long id);

	
}
