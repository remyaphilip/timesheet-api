package com.timesheet.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.timesheet.model.TimeLog;

public class TimeLogDto implements Serializable {
	private static final long serialVersionUID = -8196181397762073126L;
	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	private Integer empId;
	private String logDateStr;
	private String task;
	private float hours;

	public TimeLogDto() {

	}

	public TimeLogDto(Integer empId, String logDateStr, String task, float hours) {
		super();
		this.empId = empId;
		this.logDateStr = logDateStr;
		this.task = task;
		this.hours = hours;
	}

	public void createTimeLog(){
		 new TimeLog(this.empId,LocalDate.parse(this.logDateStr,DATE_FORMAT),this.task,this.hours);
	}
	
}
