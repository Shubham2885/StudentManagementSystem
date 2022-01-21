package com.bridgelabz.interfaces;

import java.util.List;

import com.bridgelabz.model.Student;

public interface IStudentManagement {

	void addNewStudent(final Student student);
	void updateStudentByRollNo(Student student, int rollNo);
	void removeStudentByRollNo(int rollNo);
	Student findByRollNo(int rollNo);
	Student findByFNameAndLName(String fname, String lname);
	List<Student> findAllStudents();
}
