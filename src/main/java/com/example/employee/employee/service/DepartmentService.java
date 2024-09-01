package com.example.employee.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.employee.employee.entity.Department;

@Service
public interface DepartmentService {
	
	Department saveDepartment(Department dept);
	
    List<Department> fetchDepartmentList();
	
	Optional<Department> findByDeptId(Long deptId);
	
	Department updateDepartment(Department dept, Long deptId);
	
	void deleteDepartmentbyID (Long deptId);

}
