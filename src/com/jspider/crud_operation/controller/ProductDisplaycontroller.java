package com.jspider.crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDisplaycontroller {
	public static void main(String[] args) {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			String url="jdbc:mysql://localhost:3306/jdbc-a3";
			String username="root";
			String password="root";
			 connection=DriverManager.getConnection(url, username, password);
			
			Statement statement=connection.createStatement();
			
			String displayquery="select * from product";
			
			ResultSet rs=statement.executeQuery(displayquery);
			 
			while(rs.next()) {
			int id=rs.getInt("id");
//			       int id=rs.getInt(1);   it is a 2nd way to achieve date from database....
			String name=rs.getString("name");
//			       String name=rs.getString(2);
			String color=rs.getString("color");
//			       String color=rs.getString(3);
			double price=rs.getDouble("price");
//			        double price=rs.getDouble(4);
//		            String price=rs.getString("price"); 
//			        int price=rs.getInt("price");
			  
			System.out.println(id);
			System.out.println(name);
			System.out.println(color);
			System.out.println(price);
			}
			
//			rs.next();
//			int id1=rs.getInt("id");
//			String name1=rs.getString("name");
//			String color1=rs.getString("color");
//			double price1=rs.getDouble("price");
//			System.out.println(id1);
//			System.out.println(name1);
//			System.out.println(color1);
//			System.out.println(price1);
			 
			
			
			
		} catch (ClassNotFoundException |SQLException e) {
			 			e.printStackTrace();
		} finally {
			try {
				connection.close();
			        } catch (SQLException e) {
				 				e.printStackTrace();
			                                      }
		                } 
		 
	}
	 
}
