package org.student.service.controller.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.student.service.StudentService;
import org.student.service.controller.StudentController;
import org.student.service.entity.Student;

@RunWith(SpringRunner.class)
@WebMvcTest(value = StudentController.class, secure = false)
public class StudentControllerTests 	 {
	
	@MockBean
	private StudentService studentService;
	
	Student mockStudent = new Student(1, "Suresh", "B.Tech");

	String exampleStudentJson = "{\"id\":\"1\",\"name\":\"Suresh\",\"course\":\"B.Tech\"}";

	
	@Test
	public void get(){
		Mockito.when(studentService.get(Mockito.anyInt())).thenReturn(mockStudent);
	}
	
}
