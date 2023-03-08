package com.order.DAO;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.order.model.Student;

@Repository
public class StudentDAO {

	@Autowired
	private EntityManager entityManager;
	
	public Student getStudentById(int id) {
		Student result = entityManager.find(Student.class, id);
		return result;
	}

	public String addStudent(Student student) {
		entityManager.persist(student);
		return "Student Added";
	}
}
