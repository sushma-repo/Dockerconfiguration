package com.sushma.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.docker.employeeEntity.Employee;
import com.sushma.docker.employeeRepository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceImpl{

	
	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee addEmployee( Employee e) {
		// TODO Auto-generated method stub
		Employee eSave= repo.save(e);
		
		return eSave;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> eList=repo.findAll();
		return eList;
	}

	@Override
	public Employee getById(long id) {
		// TODO Auto-generated method stub
		Employee eById = repo.findById(id).get();
		
		return eById;
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}


}
