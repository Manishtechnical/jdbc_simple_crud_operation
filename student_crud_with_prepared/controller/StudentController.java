package com.jsp.student_crud_with_prepared.controller;

import java.util.Scanner;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;
import com.jsp.student_crud_with_prepared.service.StudentService;

public class StudentController {
 public static void main(String[] args) {
		
//		Student student = new Student(1800, "vivek", "vivek@gmail.com", 8545662323l);
//		
//		StudentService studentService = new StudentService();
//		
//		studentService.insertStudentService(student);
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("main method started");
	 Student student = null;
	 StudentService studentService = new StudentService();
	 System.out.println("main method ended");
	 System.out.println("1. Insert\n2. Update\n3. Delete\n4. Display");
	 System.out.println("enter your option");
	 int ch = scanner.nextInt();
	 switch (ch) {
	case 1:
	{
		System.out.println("Enter student id");
		int id = scanner.nextInt();
		System.out.println("Enter student name");
		String name = scanner.next();
		System.out.println("Enter student email");
		String email = scanner.next();
		System.out.println("Enter student phone");
		String phone = scanner.next();
		student  = new Student(id, name, email, phone);
		studentService.insertStudentService(student);
	}
		break;
	case 2:
	{  
		 System.out.println("1. Name\n2. Email\n3. Phone");
		 System.out.println("enter your option");
		 int c = scanner.nextInt();
		 switch (c) {
		case 1:
		{
			System.out.println("Enter student Name");
			String name = scanner.next();
			System.out.println("Enter student id");
			int id = scanner.nextInt();
			student  = new Student(id, name, null, null);
			studentService.updateStudentService1(student);
		}
			break;
		case 2:
		{
			System.out.println("Enter student Email");
			String email = scanner.next();
			System.out.println("Enter student id");
			int id = scanner.nextInt();
			student  = new Student(id, null, email, null);
			studentService.updateStudentService2(student);
		}
		break;
		
		case 3:
		{
			System.out.println("Enter student Phone");
			String phone = scanner.next();
			System.out.println("Enter student id");
			int id = scanner.nextInt();
			student  = new Student(id, null, null, phone);
			studentService.updateStudentService3(student);
		}
		break;

		default:
			break;
		}
	}
	  break;
	case 3:
	{
		System.out.println("Enter student id");
		int id = scanner.nextInt();
		student  = new Student(id, null, null, null);
		studentService.deleteStudentService(student);
	}
	 break;
	 
	case 4:
	{
		studentService.displayStudentDetails();
	}
	break;

	default:
		break;
	}
}
}
