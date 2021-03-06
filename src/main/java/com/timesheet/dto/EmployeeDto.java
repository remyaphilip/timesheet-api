package com.timesheet.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.timesheet.model.Employee;

public class EmployeeDto implements Serializable {

	private static final long serialVersionUID = -7314008048174880868L;
	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy");
//	@Autowired 
//	private static OrganisationRepository orgRepo;
//	
	private Integer organisation;
	private String empName;
//	@JsonInclude(value=Include.NON_EMPTY)
//	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="MM/DD/YYYY",timezone="PST")
	private String joinDate;
	private String gender;
	private String designation;
	private String email;
	public EmployeeDto(){
	}
	
	public EmployeeDto(Integer organisation, String empName, String joinDate, String gender,
			String designation, String email) {
		super();
		this.organisation = organisation;
		this.empName = empName;
		this.joinDate = joinDate;
		this.gender = gender;
		this.designation = designation;
		this.email = email;
	}
	
	public Employee buildEmployee(){
		return new Employee(this.empName,LocalDate.parse(this.joinDate,DATE_FORMAT),this.gender,this.designation,this.email);
	}

	public Integer getOrganisation() {
		return organisation;
	}

	public String getEmpName() {
		return empName;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public String getGender() {
		return gender;
	}

	public String getDesignation() {
		return designation;
	}

	public String getEmail() {
		return email;
	}
}
