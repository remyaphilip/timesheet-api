package com.timesheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timesheet.dto.EmployeeDto;
import com.timesheet.model.Employee;
import com.timesheet.model.Organisation;
import com.timesheet.repository.EmployeeRepository;
import com.timesheet.repository.OrganisationRepository;

import lombok.extern.slf4j.Slf4j;
@Service
@Transactional
@Slf4j
public class TimesheetService {
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Autowired
	OrganisationRepository organisationRepository;
	

	public List<Employee> getServiceEmployees(){
		System.out.println(employeeRepository.findAll());
		return employeeRepository.findAll();
	}
	
	public void addServiceEmployee(EmployeeDto employee){
		employeeRepository.save(employee.buildEmployee());
	}
	
	

	public Organisation getOrganisation(Integer orgId){
		return organisationRepository.findOne(orgId);
	}

}
