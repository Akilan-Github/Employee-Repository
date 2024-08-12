package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;
import com.example.employee.exception.AgeException;
import com.example.employee.exception.AlreadyExistException;
import com.example.employee.exception.NameNotFoundException;
import com.example.employee.exception.StartsWithException;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	@Autowired
	EmployeeRepository er;

	public String postThis(Employee e) {
		return ed.postThis(e);
	}

	public List<Employee> getThis() {
		return ed.getThis();
	}

	public Employee getbyID(int a) {
		return ed.getbyID(a);
	}

	public String delete(@PathVariable int a) {
		return ed.delete(a);

	}
	public String post(Employee e) throws AgeException {
		if(e.getAge()<12)
			throw new AgeException("enter valid age");
		else
		return ed.post(e);
	}

	public List<Employee> getbyName(String a) throws NameNotFoundException {
		
		// TODO Auto-generated method stub
		List<Employee> c= er.findByName(a);
		if(c.isEmpty()) {
			throw new NameNotFoundException("invalid name");
	}
		return c;
	}

	public Employee startsWith(int a) throws StartsWithException {
		// TODO Auto-generated method stub
		Employee x = ed.startsWith(a);
		if(x.getName().startsWith("a")) {
			return  x;
		}
		else
			throw new StartsWithException("name must startswwith a"); 
		
	}

//	public String postbyName(Employee e) throws AlreadyExistException {
//		// TODO Auto-generated method stub
//		if(er.existsByName()==true) {
//			throw new AlreadyExistException("already exist");
//		}
//		return ed.postbyName(e);
//	}
}
