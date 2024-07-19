package com.jspider.jdbc_prepared_statement_crud_operation.dto;

import java.io.Serializable;
import java.time.LocalDate;
 

public class Student implements Serializable{
	 
	private int id;
	private String name;
	private String email;
	private long phone;
	private LocalDate dob;
	private String gender;
	
	// Alt+s+a parameterise and non parameterise constructor
	public Student() {
		super();
	}
//	public Student(int id, String name, String email, long phone, LocalDate dob, String gender) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.phone = phone;
//		this.dob = dob;
//		this.gender = gender;
//	}
	/**
	 * @param name
	 * @param email
	 * @param phone
	 * @param dob
	 * @param gender
	 * @return
	 * this constructor is used for insertion data to database
	 */
	
	 
	public Student(String name, String email, long phone, LocalDate dob, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
	}
	//Alt+S+R to generate setter and getter methode
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	

}
