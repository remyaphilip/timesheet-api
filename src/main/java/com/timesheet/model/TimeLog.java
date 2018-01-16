package com.timesheet.model;

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
	private Integer empId;
	private Date date;
	private String project;
	private float hours;
	
	public TimeLog(){
	}
	

	public TimeLog(Date date, String project, float timeTaken) {
		super();
		this.date = date;
		this.project = project;
		this.hours = timeTaken;
	}


	@Column(name = "date", length = 10)
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "project", length = 45)
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
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
		
	
