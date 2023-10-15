package com.jsp.studentPage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.studentPage.dto.Student;
import com.jsp.studentPage.repository.Studentrepository;

@Repository
public class StudentDao {
	@Autowired
	Studentrepository studentrepo;
	
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}

}
