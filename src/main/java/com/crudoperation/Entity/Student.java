package com.crudoperation.Entity;

import javax.persistence.*;

@Entity

public class Student {
	@Id
	private int id;
	private String name;
	private String course;
	private int feww;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFeww() {
		return feww;
	}
	public void setFeww(int feww) {
		this.feww = feww;
	}
	
	

}
