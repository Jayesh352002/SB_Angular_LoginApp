package com.example.SpringBootProject.demo.Student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	@Autowired
	private StudentService studService ; 
	
	@GetMapping("/allstudents")
	public List<StudentEntity> getStudents()
	{
		return studService.getStudents();
	}
	
	@PostMapping(path = "/savestudents")
    public String saveStudentData(@RequestBody StudentDTO studentDTO,
    							@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date)
    {
        String id = studService.addStudent(studentDTO);
        return id ;
    }
	
	@PostMapping(path = "/login")
    public String loginStudent(@RequestBody StudentLoginDTO loginDTO)
    {
		String msg = studService.loginStudent(loginDTO);
        return msg;
    }


}
