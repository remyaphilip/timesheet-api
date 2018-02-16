package com.timesheet.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.timesheet.dto.TimeLogDto;
import com.timesheet.model.Employee;
import com.timesheet.model.TimeLog;
import com.timesheet.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping(path = "/")
@Slf4j
public class EmployeeController {

	String jsonArrayString;
	Gson googleJson = new Gson();
	ArrayList javaArrayListFromGson;
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
	
	@RequestMapping(path = "employee/timelog/tabData",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void timeLogging(@RequestBody ArrayList<TimeLog> tabData){
		System.out.println(tabData);
	}
	
//	public void timeLogging(HttpServletRequest request){
//		Enumeration<String> en = request.getHeaderNames();
//		while(en.hasMoreElements()){
//			System.out.println(en.nextElement());
//		}
//		try {
//			String s = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
//			System.out.println(s);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}