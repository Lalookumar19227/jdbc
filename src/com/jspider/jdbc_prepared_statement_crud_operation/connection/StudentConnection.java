package com.jspider.jdbc_prepared_statement_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {
	
	public static Connection getStudentConnection() {
	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-a3");
//		return connection; ye tab use krege jb mujhe connection reference pr bhut bar use krna ho to but only  use single for use below way is best...
		
		System.out.println("zxcvbnm");
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-a3","root","root");
		 
		 
		 
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
			
		}
		
	}
	
	
	
	
	
	

}
