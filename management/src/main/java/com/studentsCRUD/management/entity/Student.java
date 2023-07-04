package com.studentsCRUD.management.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Students")

public class Student {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="FirstName", nullable=false)
	private String firstname;
	
	@Column(name="LastName")
	private String lastname;
	
	@Column(name="Email")
	private String email;
	
	public Student() {
		
	}
	
	public Student(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

