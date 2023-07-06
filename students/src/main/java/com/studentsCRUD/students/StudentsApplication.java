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
		
		Student student1=new Student("Yassine", "BOUMEHDI", "myboum.2002@gmail.com", "ENSIAS");
		studentRepository.save(student1);
		
		Student student2=new Student("Ahmed", "IDRISSI", "idrissiahmed@gmail.com", "ENSIAS");
		studentRepository.save(student2);
		
		Student student3=new Student("Hamza", "LACHGAR", "ham.lachgar@gmail.com", "INSEA");
		studentRepository.save(student3);
		
	}

}
