package com.bridgelabz.controller;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.Student;
import com.bridgelabz.util.ScannerUtil;

public class StudentController {

	public Student addNewStudent() {
		Student student = new Student();
		Address address = new Address();
		
		student.setRollNo(ScannerUtil.getInt("Enter the Roll No"));
		student.setfName(ScannerUtil.getString("Enter First Name"));
		student.setmName(ScannerUtil.getString("Enter Middle Name"));
		student.setlName(ScannerUtil.getString("Enter Last Name"));
		student.setMobileNo(ScannerUtil.getLong("Enter Mobile No"));
		
		address.setStreet(ScannerUtil.getString("Enter the Street"));
		address.setLandmark(ScannerUtil.getString("Enter the landmark"));
		address.setCity(ScannerUtil.getString("Enter the city"));
		address.setState(ScannerUtil.getString("Enter the state"));
		address.setTown(ScannerUtil.getString("Enter the town"));
		address.setPincode(ScannerUtil.getInt("Enter the pin code"));
		
		student.setAddress(address);
		return student;
	}
}
