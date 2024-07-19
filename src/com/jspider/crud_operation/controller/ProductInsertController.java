package com.jspider.crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		try {
			//step-1 load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			//step-2 create connection
			String url="jdbc:mysql://localhost:3306/jdbc-a3";
			String username="root";
			String password="root";
			
			Connection connection=DriverManager.getConnection(url, username, password);   
			
			//step-3 create statement
			Statement statement =connection.createStatement();
			
			// step-4 execute Query....
			String insertQuery="insert into product(id,name,price,color) values(423,'marker','20','black')";
			 
//		System.out.println(connection);
		boolean a=statement.execute(insertQuery);
		
		System.out.println("Data Stored....");
			
		} catch (ClassNotFoundException | SQLException e) {
			 
			e.printStackTrace();
			System.out.println("Data not Stored......");
			
		}
		
		
		
		
		

	}

}
