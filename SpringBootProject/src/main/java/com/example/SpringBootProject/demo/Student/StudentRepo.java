package com.example.SpringBootProject.demo.Student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity , Long> {
	
	Optional<StudentEntity> findOneByEmailAndPassword(String email, String password);
	StudentEntity findByEmail(String email);

}
