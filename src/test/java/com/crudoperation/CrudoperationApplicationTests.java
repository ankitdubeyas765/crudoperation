package com.crudoperation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudoperation.Entity.Student;
import com.crudoperation.Repository.StudentRepositiory;

@SpringBootTest
class CrudoperationApplicationTests {
	
	@Autowired
	private StudentRepositiory studentRepo;

	@Test
	void saveStudent() {
		Student s=new Student();
		s.setName("ankit");
		s.setCourse("java");
		s.setFeww(2500);
	studentRepo.save(s);
	}

}
