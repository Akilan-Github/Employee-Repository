package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.exception.AgeException;
import com.example.employee.exception.NameNotFoundException;
import com.example.employee.exception.StartsWithException;
import com.example.employee.service.EmployeeService;




@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping("/postEmp")
	public String postThis(@RequestBody Employee e) {
		return es.postThis(e);
	}
	@GetMapping("/getEmp")
	public List<Employee> getThis(){
		return es.getThis();
	}
	@GetMapping("/get/{a}")
	public Employee  getbyID(@PathVariable int a){
		return es.getbyID(a);
	}
	@GetMapping("/delete/{a}")
	public String delete(int a) {
		return es.delete(a);
		
	}
	@PostMapping("/post")
	public String post(@RequestBody Employee e) throws AgeException {
		return es.post(e);
	}
	@GetMapping("/getemplname/{a}")
	public List<Employee> getbyName(@PathVariable String a) throws NameNotFoundException{
		return es.getbyName(a);
	}
	@GetMapping("/startswith/{a}")
	public Employee startsWith(@PathVariable int a) throws StartsWithException  {
		return es.startsWith(a);
	}
//	@PostMapping("/postEmp}")
//	public String postbyName(@RequestBody Employee e) throws AlreadyExistException {
//		return es.postbyName(e);
//	}
	
}
