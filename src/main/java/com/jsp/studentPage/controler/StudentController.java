package com.jsp.studentPage.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.studentPage.dto.Student;
import com.jsp.studentPage.service.StudentService;
import com.jsp.studentPage.utli.ResponseStructure;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	 
	@CrossOrigin(origins = "http://localhost:4200/")
	@PostMapping("/student")
	public ResponseEntity<ResponseStructure<Student>> saveStudent(@RequestBody Student student){
		return service.saveStudent(student);
	}

}
