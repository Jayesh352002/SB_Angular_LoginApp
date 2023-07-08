package com.example.SpringBootProject.demo.Student;

public class StudentLoginDTO {

	private String studentEmail ;
	private String studentPassword ; 
	
	public StudentLoginDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudentLoginDTO(String studentEmail, String studentPassword) {
		super();
		this.studentEmail = studentEmail;
		this.studentPassword = studentPassword;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return "StudentLoginDTO [studentEmail=" + studentEmail + ", studentPassword=" + studentPassword + "]";
	}
	
	

}
