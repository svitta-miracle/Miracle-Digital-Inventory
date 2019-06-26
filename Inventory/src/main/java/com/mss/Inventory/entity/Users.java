package com.mss.Inventory.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class Users {
	
	
	private String id;
	
	
	private String firstname;
	
	private String lastname;
	
	private String role;
	
	private String password;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private String projectId;
		
	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Users() {
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Users(String id, String firstname, String lastname, String role, String password, String country,
			String state, String city,String projectId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
		this.password = password;
		this.country = country;
		this.state = state;
		this.city = city;
		this.projectId=projectId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", role=" + role
				+ ", password=" + password + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", projectId=" + projectId + "]";
	}
	
		
		
	

}
