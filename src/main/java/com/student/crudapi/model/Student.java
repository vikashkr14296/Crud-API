package com.student.crudapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long std_id;
	
	@Column(name="std_name")
	private String std_name;
	
	@Column(name="std_rollno")
	private int std_rollno;
	
	@Column(name="std_course")
	private String std_course;
	
	@Column(name="std_age")
	private int std_age;
	
	@Column(name="std_city")
	private String std_city;

	public Long getStd_id() {
		return std_id;
	}

	public void setStd_id(Long std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public int getStd_rollno() {
		return std_rollno;
	}

	public void setStd_rollno(int std_rollno) {
		this.std_rollno = std_rollno;
	}

	public String getStd_course() {
		return std_course;
	}

	public void setStd_course(String std_course) {
		this.std_course = std_course;
	}

	public int getStd_age() {
		return std_age;
	}

	public void setStd_age(int std_age) {
		this.std_age = std_age;
	}

	public String getStd_city() {
		return std_city;
	}

	public void setStd_city(String std_city) {
		this.std_city = std_city;
	}

	public Student(Long std_id, String std_name, int std_rollno, String std_course, int std_age, String std_city) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_rollno = std_rollno;
		this.std_course = std_course;
		this.std_age = std_age;
		this.std_city = std_city;
	}
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_rollno=" + std_rollno + ", std_course="
				+ std_course + ", std_age=" + std_age + ", std_city=" + std_city + "]";
	}
	
	
	
}
