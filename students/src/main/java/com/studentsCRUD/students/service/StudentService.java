package com.studentsCRUD.students.service;

import java.util.List;
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
	
	public List<Student> listAll() {
        return (List<Student>) studentRepository.findAll();
    }
	
	public void deleteEmployee(final Long ID) {
		studentRepository.deleteById(ID);
	}
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
}
