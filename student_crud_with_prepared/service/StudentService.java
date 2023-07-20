package com.jsp.student_crud_with_prepared.service;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentService {
  StudentDao  studentDao = new StudentDao();
  
  public Student insertStudentService(Student student) {
	   System.out.println("insert service method started !!!");
	   
	   if(student.getStudentId()<=9999) {
		   Student student2 = studentDao.insertStudent(student);
		   System.out.println("insert services method ended !!!");
		   return student2;
	   }
	   else {
		   System.err.println("please pass id 4 digits or lesds than !!");
	   }
	   
	   return null;
  }
  
  public Student updateStudentService1(Student student) {
	   System.out.println("Update service method started !!!");
	   Student student2 = studentDao.updateStudentname(student);
	   System.out.println("Update services method ended !!!");
	   return null;
 }
  public Student updateStudentService2(Student student) {
	   System.out.println("Update service method started !!!");
	   Student student2 = studentDao.updateStudentemail(student);
	   System.out.println("Update services method ended !!!");
	   return null;
}
  public Student updateStudentService3(Student student) {
	   System.out.println("Update service method started !!!");
	   if (student.getStudentPhone().length()==10) {
		   Student student2 = studentDao.updateStudentphone(student);
		   System.out.println("Update services method ended !!!");
		   return student2;
	  }
	   else
	   {
		   System.err.println("please Enter the Valid Phone Number !!");
	   }
	 
	   return null;
}
  
  public Student deleteStudentService(Student student) {
	   System.out.println("Deletion service method started !!!");
	   Student student2 = studentDao.DeleteStudent(student);
	   System.out.println("Deletion services method ended !!!");
	   return null;
}
  
 public void displayStudentDetails() {
	 studentDao.displayStudentDetails();
 }
  
}
