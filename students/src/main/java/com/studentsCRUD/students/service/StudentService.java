package com.studentsCRUD.students.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentsCRUD.students.model.Student;
import com.studentsCRUD.students.repository.StudentRepository;

import lombok.Data;

@Data
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Optional<Student> getStudent(final Long ID) {
		return studentRepository.findById(ID);
	}
	
	public Iterable<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	public void deleteEmployee(final Long ID) {
		studentRepository.deleteById(ID);
	}
	
	public Student saveStudent(Student student) {
		Student savedStudent=studentRepository.save(student);
		return savedStudent;
	}
	
}
