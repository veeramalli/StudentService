package org.student.service;

import java.io.Serializable;

import org.student.service.entity.Student;

public interface StudentService {

	public Student get(int id);
	
	public Student update(Student student);
	
	public boolean delete(int id);
	
	public Iterable<Student> find(Iterable<Serializable> ids);
	
	public Iterable<Student> findAll();
	
}
