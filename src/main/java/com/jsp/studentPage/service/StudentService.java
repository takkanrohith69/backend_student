package com.jsp.studentPage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.studentPage.dao.StudentDao;
import com.jsp.studentPage.dto.Student;
import com.jsp.studentPage.utli.ResponseStructure;

@Service
public class StudentService {
		@Autowired
		private StudentDao dao;

		
		public ResponseEntity<ResponseStructure<Student>> saveStudent(Student student){
			ResponseStructure<Student> struture = new ResponseStructure<Student>();
			struture.setData(dao.saveStudent(student));
			struture.setMessage("Student Data Saved SuccessFully");
			struture.setStatus(HttpStatus.CREATED.value());
			
			return new ResponseEntity<ResponseStructure<Student>>(struture,HttpStatus.CREATED);
		}

}
