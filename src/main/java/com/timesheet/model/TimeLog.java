package com.timesheet.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TimeLog implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3947082565357864922L;
	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	private Integer empId;
	private LocalDate logDate;
	private String task;
	private float hours;
	
	public TimeLog(){
	}
	

	public TimeLog(Integer empId,LocalDate logDate, String task, float hours) {
		super();
		this.empId = empId;
		this.logDate = logDate;
		this.task = task;
		this.hours = hours;
	}


	@Column(name = "date", length = 10)
	public LocalDate getDate() {
		return logDate;
	}
	
	public void setDate(LocalDate date) {
		this.logDate = date;
	}

	@Column(name = "project", length = 45)
	public String getProject() {
		return task;
	}

	public void setProject(String project) {
		this.task = project;
	}

	@Column(name = "timetaken")
	public float getTimeTaken() {
		return hours;
	}

	public void setTimeTaken(float timeTaken) {
		this.hours = timeTaken;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
		
	
