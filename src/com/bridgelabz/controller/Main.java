package com.bridgelabz.controller;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.interfaces.IStudentManagement;
import com.bridgelabz.model.Student;
import com.bridgelabz.services.StudentManagement;
import com.bridgelabz.util.ScannerUtil;

public class Main {

	public static void main(String[] args) {
		
		IStudentManagement studentManagement = new StudentManagement();
		StudentController controller = new StudentController();
		int x = 1;
		do {
			System.out.println("Menu...\n 1 Add Student \n 2 Remove Student \n 3 Show List of Student \n 4 find Student by Roll No");
			int ch = ScannerUtil.getInt("Enter your choise");
			
			switch(ch) {
			case 1 :	Student student1 = controller.addNewStudent();
					studentManagement.addNewStudent(student1);
				break;
			case 2 :
				break;
			case 3 :	System.out.println(studentManagement.findAllStudents());
				break;
			case 4 : Student student = studentManagement.findByRollNo(ScannerUtil.getInt("Enter the roll No"));
				System.out.println("Details of Student = "+student);
				break;
			default :
				break;
			}
			x = ScannerUtil.getInt("Do you want to contineu... press 1");
		}while(x == 1);
		System.out.println("Shilpi");
	}
}
