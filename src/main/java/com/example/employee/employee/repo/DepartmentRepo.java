package com.example.employee.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.employee.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
