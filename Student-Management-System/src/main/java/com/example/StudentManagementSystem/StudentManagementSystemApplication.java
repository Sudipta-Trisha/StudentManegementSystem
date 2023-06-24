package com.example.StudentManagementSystem;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Maria", "Gomez", "maria11@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Sanjay", "Ghosh", "sanjay22@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("tony", "kakkar", "tony33@gmail.com");
//		studentRepository.save(student3);
	}

}


