package com.order.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.order.DAO.StudentDAO;
import com.order.model.Student;
import com.order.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public Student getStudentById(int id) {
		
		return studentDAO.getStudentById(id);
	}

	@Override
	@Transactional
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.addStudent(student);
	}
	
}
