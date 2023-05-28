package com.crudoperation.Repository;

import org.springframework.data.repository.CrudRepository;

import com.crudoperation.Entity.Student;

public interface StudentRepositiory extends CrudRepository<Student, Long> {

}
