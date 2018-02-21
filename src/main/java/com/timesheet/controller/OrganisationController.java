package com.timesheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.dto.EmployeeDto;
import com.timesheet.model.Employee;
import com.timesheet.model.Organisation;
import com.timesheet.service.TimesheetService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/")
public class OrganisationController{

	@Autowired
	public TimesheetService timesheetService;
	
	
	@RequestMapping(path = "employee/",method = RequestMethod.POST,consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void addEmployee(@RequestBody EmployeeDto employeeDto) {
		log.info("Add user.."+employeeDto);
		timesheetService.addServiceEmployee(employeeDto);
	}

	@RequestMapping(path = "employee/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployees(){
		return timesheetService.getServiceEmployees();	
	}
	
	@RequestMapping(path = "organisation/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Organisation getOrganisation(@PathVariable("id") Integer id){
		
		return timesheetService.getOrganisation(id);
	}


//	@ExceptionHandler(value = SQLException.class)
	//	public String exeHandler(SQLException e){
//		return e.getSQLState();
//		
//	}
	
}
