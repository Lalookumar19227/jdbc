package com.jspider.crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProductController {
	
	public static void main(String[] args) throws SQLException {
		Connection connection =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbc-a3";
			String user="root";
			String password="root";
			  connection =DriverManager.getConnection( url, user, password);
			
			  Statement statement=connection.createStatement();
			  
			  String deleteQuery="delete from product where id=423";
			  
			  	boolean a=statement.execute(deleteQuery);
//			  	System.out.println(a);
			  	if(false==a) {
			  		 System.out.println("yessssss..");
			  	}else {
			  		System.out.println("noooo..");
			  	}
			  			 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			 connection.close();
		}
		
		
		
	}
	

}
