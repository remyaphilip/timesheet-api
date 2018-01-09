package com.timesheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.model.Employee;
import com.timesheet.repository.EmployeeRepository;


@RestController
@RequestMapping(path = "/")
public class EmployeeController {

	@Autowired
	public EmployeeRepository employeeRepository;


	
	@RequestMapping(path = "organisation/landing",method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee){
		employeeRepository.save(employee);
	}
	
	@RequestMapping(path = "employee/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("id") Integer id){
		return employeeRepository.findOne(id);
	}
//	@ExceptionHandler(value = SQLException.class)
//	public String exeHandler(SQLException s){
//		return s.getSQLState();
//	}

}
