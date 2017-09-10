package org.student.service.dao;

import java.io.Serializable;

import org.student.service.entity.Student;

public interface StudentDao {
	
	public Student get(int id);
	
	public Student update(Student student);
	
	public boolean delete(int id);
	
	public Iterable<Student> findAll();
	
	public Iterable<Student> find(Iterable<Serializable> ids);
	
}
