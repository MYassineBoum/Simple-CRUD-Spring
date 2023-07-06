package com.studentsCRUD.students.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Students")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name="FirstName")
	private String firstname;
	
	@Column(name="LastName")
	private String lastname;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="School")
	private String school;
	
	public Student() {
		
	}
	
	public Student(String firstname, String lastname, String email, String school) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.school = school;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
