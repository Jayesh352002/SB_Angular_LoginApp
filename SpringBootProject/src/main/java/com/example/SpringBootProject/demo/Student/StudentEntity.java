package com.example.SpringBootProject.demo.Student;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class StudentEntity {

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ; 
	
	@Column(name = "student_name")
	private String name ;
	
	@Column(name = "student_email")
	private String email ;
	
	@Column(name = "student_dob")
	private LocalDate dob ; 
	
	@Column(name = "student_age")
	private Integer age ; 
	
	@Column(name = "student_password")
	private String password ; 
	
	
	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(Long id, String name, String email, LocalDate dob, Integer age , String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
		this.password = password;
	}

	public StudentEntity(String name, String email, LocalDate dob, Integer age , String password) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getPassword() {
		return password ; 
	}
	
	public void setPassword(String password) {
		this.password = password ; 
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age
				+ ", password=" + password + "]";
	}

	
	
	

}
