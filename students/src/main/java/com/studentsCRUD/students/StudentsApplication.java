package com.studentsCRUD.students;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentsCRUD.students.model.Student;
import com.studentsCRUD.students.repository.StudentRepository;

@SpringBootApplication
public class StudentsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(StudentsApplication.class, args);
		
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void run(String... args) throws Exception {
		

		
	}

}
