package com.example.employee.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.employee.employee.entity.Employee;

@Service
public interface EmployeeService {

	Employee  saveEmployee(Employee employee);
	
	List<Employee> fetchEmployeeList();
	
	Optional<Employee> findById(long empId);
	
	Employee updateEmployee(Employee employee, Long empId);
	
	void deleteEmployeebyID (Long empId);
}
