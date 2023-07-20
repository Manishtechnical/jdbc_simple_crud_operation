package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jsp.student_crud_with_prepared.connection.StudentConnection;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentDao {
    
	Connection connection = StudentConnection.getStudentConnection();
	
	
	/*
	 * insert method for student
	 */
	public Student insertStudent(Student student) {
    String insertQuery = "insert into student values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentEmail());
			preparedStatement.setString(4, student.getStudentPhone());
			
			preparedStatement.execute();
			
			return student;
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	
	
	/**
	 * Update method for student
	 * @param student
	 * @return
	 */
	public Student updateStudentname(Student student) {
		String updateQuery = "update student set name = ? where id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, student.getStudentName());
			preparedStatement.setInt(2, student.getStudentId());
			preparedStatement.executeUpdate();
			
			return student;
			} catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
		}
		return null;
	}
	
	public Student updateStudentemail(Student student) {
		String updateQuery = "update student set email = ? where id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, student.getStudentEmail());
			preparedStatement.setInt(2, student.getStudentId());
			preparedStatement.executeUpdate();
			
			return student;
			} catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
		}
		return null;
	}
	
	public Student updateStudentphone(Student student) {
		String updateQuery = "update student set mo_no = ? where id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, student.getStudentPhone());
			preparedStatement.setInt(2, student.getStudentId());
			preparedStatement.executeUpdate();
			
			return student;
			} catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	/**
	 * Delete method for student
	 * @param student
	 * @return
	 */
	public Student DeleteStudent(Student student) {
		
			
		String DeleteQuery = "delete from student where id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(DeleteQuery);
			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.executeUpdate();
			
			return student;
			} catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Display method for student
	 */
	public void displayStudentDetails() {
		String displayStudentQuery = "select * from student";
		
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(displayStudentQuery);
			ResultSet resultset = preparedstatement.executeQuery();
			
			while (resultset.next()) {
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				String email = resultset.getString("email");
				String phone = resultset.getString("mo_no");
				
				System.out.println("id = "+id);
				System.out.println("name = "+name);
				System.out.println("email = "+email);
				System.out.println("phone = "+phone);
				
			}
			} catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
		}
	
		
	}
}

