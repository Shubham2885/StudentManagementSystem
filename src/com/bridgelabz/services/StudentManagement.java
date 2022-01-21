package com.bridgelabz.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.interfaces.IStudentManagement;
import com.bridgelabz.model.Student;

public class StudentManagement implements IStudentManagement{

	final List<Student> students = new ArrayList<Student>();
	
	@Override
	public void addNewStudent(Student student) {
		students.add(student);
		System.out.println("New Student is added");
	}

	@Override
	public void updateStudentByRollNo(Student student, int rollNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findByRollNo(int rollNo) {
		for(int i=0;i<students.size();i++) {
			Student student = students.get(i);
			if(rollNo == student.getRollNo()) {
				return student;
			}
		}
		return null;
	}

	@Override
	public Student findByFNameAndLName(String fname, String lname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllStudents() {
		return students;
	}

}
