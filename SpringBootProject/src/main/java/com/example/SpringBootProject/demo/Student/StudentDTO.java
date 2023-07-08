package com.example.SpringBootProject.demo.Student;

import java.time.LocalDate;

public class StudentDTO {

	private Long studentId ;
    private String studentName ;
    private String studentEmail ;
    private LocalDate studentDob ; 
    private Integer studentAge ;
    private String studentPassword ; 
    
	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public StudentDTO(Long studentId, String studentName, String studentEmail, LocalDate studentDob, Integer studentAge,
			String studentPassword) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentDob = studentDob;
		this.studentAge = studentAge;
		this.studentPassword = studentPassword;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public LocalDate getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(LocalDate studentDob) {
		this.studentDob = studentDob;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public StudentDTO(String studentName, String studentEmail, LocalDate studentDob, Integer studentAge,
			String studentPassword) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentDob = studentDob;
		this.studentAge = studentAge;
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentDob=" + studentDob + ", studentAge=" + studentAge + ", studentPassword=" + studentPassword
				+ "]";
	}

	
    
	
    
}
