package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Student;
import com.order.service.StudentService;

@RestController
public class OrderController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/orders")
	public String getOrder() {
		
		return "order1, order2";
	}

	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
	}
}
