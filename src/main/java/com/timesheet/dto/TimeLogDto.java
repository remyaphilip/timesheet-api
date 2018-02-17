package com.timesheet.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.timesheet.model.TimeLog;

public class TimeLogDto implements Serializable {
	private static final long serialVersionUID = -8196181397762073126L;
	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	private String task;
	private float hours;
	@JsonProperty("logDate")
	private String logDateStr;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TimeLogDto [logDateStr=").append(logDateStr).append(", task=").append(task).append(", hours=")
				.append(hours).append("]");
		return builder.toString();
	}
	
	public TimeLogDto(){}
	
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public String getLogDateStr() {
		return logDateStr;
	}

	public void setLogDateStr(String logDateStr) {
		this.logDateStr = logDateStr;
	}

	public TimeLogDto( String logDateStr, String task, float hours) {
		super();
		this.logDateStr = logDateStr;
		this.task = task;
		this.hours = hours;
	}

	public TimeLog createTimeLog(){
		 return new TimeLog(LocalDate.parse(this.logDateStr,DATE_FORMAT),this.task,this.hours);
	}
}
