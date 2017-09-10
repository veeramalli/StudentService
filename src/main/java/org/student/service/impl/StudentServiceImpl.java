package org.student.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.service.StudentService;
import org.student.service.dao.StudentDao;
import org.student.service.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public Student get(int id) {
		return dao.get(id);
	}
	
	@Override
	public Student update(Student student) {
		return dao.update(student);
	}
	
	@Override
	public boolean delete(int id) {
		return dao.delete(id);
	}
	
	@Override
	public Iterable<Student> find(Iterable<Serializable> ids) {
		return dao.find(ids);
	}
	
	@Override
	public Iterable<Student> findAll() {
		return dao.findAll();
	}

}
