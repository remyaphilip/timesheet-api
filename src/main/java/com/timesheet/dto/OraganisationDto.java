package com.timesheet.dto;

public class OraganisationDto implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3520970291556730218L;
	private Integer orgId;
	private String name;
	private String address;
	private String email;
	private Integer contactNo;
	
	
	
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getContactNo() {
		return contactNo;
	}
	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
