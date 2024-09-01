package com.example.employee.employee.entity;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deptId;
	
	@Column (name="deptName", nullable=false)
	private String departmentName;
	
	
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;

}
