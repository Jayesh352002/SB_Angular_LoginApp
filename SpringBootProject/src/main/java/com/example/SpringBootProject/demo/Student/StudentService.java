package com.example.SpringBootProject.demo.Student;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	
	private StudentRepo studentRepo ; 
	
	
	@Autowired
	public StudentService(StudentRepo studentRepo)
	{
		this.studentRepo = studentRepo ; 
	}

	public List<StudentEntity> getStudents()
	{
		return studentRepo.findAll();
	}

	public String addStudent(StudentDTO studentDTO) {
		StudentEntity stud = new StudentEntity(
				studentDTO.getStudentName(),
				studentDTO.getStudentEmail(),
				studentDTO.getStudentDob(),
				studentDTO.getStudentAge(),
				studentDTO.getStudentPassword()
        );

        studentRepo.save(stud);

        return stud.getName();

	}
	
	public String loginStudent(StudentLoginDTO studLoginDTO) {
		
		//String msg = "";
        StudentEntity student1 = studentRepo.findByEmail(studLoginDTO.getStudentEmail());
        if (student1 != null) {
            String password = studLoginDTO.getStudentPassword();
            String loginPassword = student1.getPassword();
            //Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (password.equals(loginPassword)) {
                Optional<StudentEntity> stud = studentRepo.findOneByEmailAndPassword(studLoginDTO.getStudentEmail(), loginPassword);
                if (stud.isPresent()) {
                    return "Login Success";
                } else {
                    return "Login Failed";
                }
            } else {
                return "Password Does Not Match";
            }
        }else {
            return "Email Not Exists ";
        }
		
	}

}
