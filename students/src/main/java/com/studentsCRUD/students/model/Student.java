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
	
}
