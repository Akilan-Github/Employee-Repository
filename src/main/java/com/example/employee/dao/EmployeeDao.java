package com.example.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;


@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository er;
public String postThis(Employee e) {
	er.save(e);
	return "posted successfully";
}
public List<Employee> getThis() {
	
	return er.findAll();
}
public Employee  getbyID(int a){
	return er.findById(a).get();
}
public String delete(@PathVariable int a) {
	er.deleteById(a);
	return "Deleted Successfully";
}
public String post(Employee e) {
	// TODO Auto-generated method stub
	er.save(e);
	return "posted";
	
}
public List<Employee> getbyName(String name) {
	// TODO Auto-generated method stub
	return er.findByName(name);
	
}
public Employee startsWith(int a) {
	// TODO Auto-generated method stub
	return er.findById(a).get();
}
//public String postbyName(Employee e) {
//	// TODO Auto-generated method stub
//	er.save(e);
//	return "done";
//}

}
