package org.student.service.dao.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.student.service.dao.StudentDao;
import org.student.service.entity.Student;
import org.student.service.repository.StudentRepository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private StudentRepository studentRepository;
		
	@Override
	public Student get(int id) {
		return studentRepository.findOne(id);
	}

	@Override
	public Student update(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public boolean delete(int id) {
		boolean flag = true;
		try {
			studentRepository.delete(id);
		} catch (Exception e) {
			flag = false;
		} 
		return flag;
	}
	
	@Override
	public Iterable<Student> find(Iterable<Serializable> ids) {
		return studentRepository.findAll(ids);
	}

	@Override
	public Iterable<Student> findAll() {
		return studentRepository.findAll();
	}

}
