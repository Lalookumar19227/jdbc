package com.jspider.crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateProductController {
public static void main(String[] args) {
	Connection connection=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbc-a3";
		String username="root";
		String password="root";
		
		 connection=DriverManager.getConnection(url, username, password);   
		
		//step-3 create statement
		Statement statement =connection.createStatement();
		
		//step-4 executeQuery
		String updateQueary="update product set color='blue' where id=423";
		
		
		// this methode will return 0 or 1  
				 int a=statement.executeUpdate(updateQueary);
		 
				 if(a==1) {
					 System.out.println("Data Succeesfully update...");
				    }else {
				    	System.err.println("given primary key is not available in the table..");
				    }
		 
		 
	} catch (ClassNotFoundException | SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
				 
	}
	finally {
		try {
			connection.close();
		} catch ( SQLException e) {
			// TODO: handle exception
		}
		 
	}
	
	
	
	
}
	
	
	
	
	
}
