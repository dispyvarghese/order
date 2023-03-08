package com.order.service;

import org.springframework.stereotype.Service;

import com.order.model.Student;

@Service
public interface StudentService {

	Student getStudentById(int id);

	String addStudent(Student student);

}
