package com.jsp.studentPage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.studentPage.dto.Student;

public interface Studentrepository extends JpaRepository<Student, Integer> {

}
