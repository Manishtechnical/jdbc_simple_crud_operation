package com.jsp.student_crud_with_prepared.dto;

/**
 * 
 */

public class Student {
 private int studentId ;
 private String studentName;
 private String studentEmail;
 private String studentPhone;
 
 //to generate to generate parametrized constructor------> alt+s+a
 
/*
 * no argument constructor
 */
 public Student() {
	 super();
 }
 
 
public Student(int studentId, String studentName, String studentEmail, String studentPhone) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentEmail = studentEmail;
	this.studentPhone = studentPhone;

}

//getter and setter method --->Alt+s+r


public String toString() {
	return "";
}


public int getStudentId() {
	return studentId;
}


public void setStudentId(int studentId) {
	this.studentId = studentId;
}


public String getStudentName() {
	return studentName;
}


public void setStudentName(String studentName) {
	this.studentName = studentName;
}


public String getStudentEmail() {
	return studentEmail;
}


public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}


public String getStudentPhone() {
	return studentPhone;
}


public void setStudentPhone(String studentPhone) {
	this.studentPhone = studentPhone;
}
 
}
