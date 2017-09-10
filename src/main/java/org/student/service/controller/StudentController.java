package org.student.service.controller;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.student.service.StudentService;
import org.student.service.entity.Student;

@RestController
@RequestMapping("/student")
@XmlRootElement
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public Student get(@PathVariable(value="id") int id) {
		return service.get(id);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Student update(Student student) {
		return service.update(student);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public boolean update(@PathVariable(value="id") int id) {
		return service.delete(id);
	}
	
	@RequestMapping(value="/find/{ids}", method=RequestMethod.POST)
	public Iterable<Student> find(Iterable<Serializable> ids) {
		return service.find(ids);
	}
	
	@RequestMapping(value="/findall", method=RequestMethod.GET)
	public Iterable<Student> findAll() {
		return service.findAll();
	}
}
