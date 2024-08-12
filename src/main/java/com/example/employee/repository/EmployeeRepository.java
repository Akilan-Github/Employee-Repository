package com.example.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);
	//boolean existsByName(String name);
	//boolean existsByName();

}
