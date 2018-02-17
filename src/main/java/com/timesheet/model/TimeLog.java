package com.timesheet.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "timelog", catalog = "timesheet")
public class TimeLog implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3947082565357864922L;
	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	private Integer id;
	@JsonIgnore
	private Employee employee;
	private LocalDate logDate;
	private String task;
	private float hours;

	public TimeLog() {
	}

	public TimeLog(LocalDate logDate, String task, float hours) {
		super();
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

	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}	

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="emp_id")
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TimeLog [id=").append(id).append(", employee=").append(employee).append(", logDate=")
				.append(logDate).append(", task=").append(task).append(", hours=").append(hours).append("]");
		return builder.toString();
	}
	
	
}
