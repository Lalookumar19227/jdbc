 package com.jspider.jdbc_prepared_statement_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.jspider.jdbc_prepared_statement_crud_operation.connection.StudentConnection;
import com.jspider.jdbc_prepared_statement_crud_operation.dto.Student;

public class StudentDao {

	Connection connection = StudentConnection.getStudentConnection();

	PreparedStatement ps;

	private final String INSERTSTUDENTQUERY = "insert into student(name,email,phone,dob,gender) values(?,?,?,?,?)";
	private final String DISPLAYSTUDENTQUERY = "select * from student";
	private final String UPDATE_STUDENT_NAME_BY_STUDENT_ID = "update student set name=? where id=?";
	private final String DELETE_STUDENT_BY_STUDENT_ID = "delete from student where id=?";

	public Student saveStudentDao(Student student) {
		try {
			ps = connection.prepareStatement(INSERTSTUDENTQUERY);
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setLong(3, student.getPhone());
			ps.setObject(4, student.getDob());
			ps.setString(5, student.getGender());
			ps.execute();
			return student;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}

	}

	public Student[] displayAllStudentDao() {
		try {
			PreparedStatement ps = connection.prepareStatement(DISPLAYSTUDENTQUERY);
			ResultSet resultSet = ps.executeQuery();
			Student[] st = new Student[7];
			int i = 0;

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String gender = resultSet.getString("gender");
				long phone = resultSet.getLong("phone");

				LocalDate dob = resultSet.getDate("dob").toLocalDate();
				Student student = new Student(name, email, phone, dob, gender);
				st[i] = student;
				i++;

			}
			return st;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public int updateStudentNameByStudentIdDao(String name, int id) {
		try {
			ps = connection.prepareStatement(UPDATE_STUDENT_NAME_BY_STUDENT_ID);
			ps.setString(1, name);
			ps.setInt(2, id);

			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;

		}

	}

	public int deleteStudentByIdDao(int id) {
		try {
			ps = connection.prepareStatement(DELETE_STUDENT_BY_STUDENT_ID);
			ps.setInt(1, id);
			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;

		}
	}
}
