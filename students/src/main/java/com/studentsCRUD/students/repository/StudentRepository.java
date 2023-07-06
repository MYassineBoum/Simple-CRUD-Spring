package com.studentsCRUD.students.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentsCRUD.students.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	
}
