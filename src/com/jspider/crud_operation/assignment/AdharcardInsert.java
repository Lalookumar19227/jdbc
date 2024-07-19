package com.jspider.crud_operation.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AdharcardInsert {
	
	public static void main(String[] args) {
		Connection connection=null;
		try {
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			String url="jdbc:mysql://localhost:3306/jdbc-a3";
			String username="root";
			String password="root";
			
			 connection=DriverManager.getConnection(url, username, password);   
			
			 
			Statement statement =connection.createStatement();
			
			
			String insertQuery="insert into adharcard(id,name,dob,address,fathername,gender) values(423,'kuldeep','2001-10-17','village-mahmadpur dist-nalanda pincode-803108 state-bihar','mangal yadav','male')";
			
//		System.out.println(connection);
		boolean a=statement.execute(insertQuery);
		System.out.println("ysssssssss"); 
		
		System.out.println("Data Stored....");
			
		} catch (ClassNotFoundException | SQLException e) {
			 
			e.printStackTrace();
			 
			
		}finally {
			 try {
				connection.close();
			} catch (SQLException e) {
				 
				e.printStackTrace();
			}
		}
 
	}

 	}
	 

