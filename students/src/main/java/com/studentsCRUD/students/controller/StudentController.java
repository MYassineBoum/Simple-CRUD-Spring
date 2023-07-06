package com.studentsCRUD.students.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.studentsCRUD.students.service.StudentService;
import com.studentsCRUD.students.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/all")
	public String all(Model model) {
		List<Student> liststudents = studentService.listAll();
		model.addAttribute("liststudents", liststudents);
		return "all";	
	}
	
}
