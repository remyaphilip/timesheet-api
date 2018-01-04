package com.timesheet.model;

import static javax.persistence.GenerationType.IDENTITY;

// default package
// Generated Nov 17, 2017 7:39:13 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Organisation generated by hbm2java
 */
@Entity
@Table(name = "organisation", catalog = "timesheet")
public class Organisation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3872594794799370089L;
	private Integer orgId;
	private String name;
	private String address;
	private String email;
	private Integer contactNo;
	@JsonIgnore
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Organisation() {
	}

	public Organisation(String name, String address, String email, Integer contactNo, Set<Employee> employees) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactNo = contactNo;
		this.employees = employees;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "org_id", unique = true, nullable = false)
	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "contact_no")
	public Integer getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organisation")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
