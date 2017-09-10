package org.student.service.repository;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.student.service.entity.Student;

@Transactional
public interface StudentRepository extends CrudRepository<Student, Serializable> {
}
