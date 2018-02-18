package com.timesheet.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "timelog", catalog = "timesheet")
public class Timelog implements java.io.Serializable {

	private static final long serialVersionUID = 1871977717947082854L;
	private Integer id;
	private Employee employee;
	private LocalDate date;
	private String project;
	private Float timetaken;

	public Timelog() {
	}

	public Timelog(Employee employee) {
		this.employee = employee;
	}

	public Timelog(Employee employee, LocalDate LocalDate, String project, Float timetaken) {
		this.employee = employee;
		this.date = LocalDate;
		this.project = project;
		this.timetaken = timetaken;
	}

	public Timelog(LocalDate date, String project, float timetaken) {
		this.date = date;
		this.project = project;
		this.timetaken = timetaken;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id", nullable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	//@Temporal(TemporalType.DATE)
	@Column(name = "LocalDate", length = 10)
	public LocalDate getLocalDate() {
		return this.date;
	}

	public void setLocalDate(LocalDate LocalDate) {
		this.date = LocalDate;
	}

	@Column(name = "project", length = 45)
	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Column(name = "timetaken", precision = 12, scale = 0)
	public Float getTimetaken() {
		return this.timetaken;
	}

	public void setTimetaken(Float timetaken) {
		this.timetaken = timetaken;
	}

}
