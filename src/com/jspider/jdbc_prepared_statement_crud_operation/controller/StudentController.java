package com.jspider.jdbc_prepared_statement_crud_operation.controller;

import java.security.Provider.Service;
import java.time.LocalDate;
import java.util.Scanner;

import com.jspider.jdbc_prepared_statement_crud_operation.dao.StudentDao;
import com.jspider.jdbc_prepared_statement_crud_operation.dto.Student;
import com.jspider.jdbc_prepared_statement_crud_operation.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		Scanner scanner = new Scanner(System.in);
        StudentService service= new StudentService();
		while (true) {
			System.out.println("Enter your option");
			System.out.println("1.Insert\n2.Display\n3.Update\n4.Delete\n5.Exit");
			int input = scanner.nextInt();
			switch (input) {

			case 1: {
				String name = "Kuldeep";
				String email = "kul@gmail.com";
				String dob = "2001-10-17";
				String gender = "male";
				long phone = 9963978245l;

				Student student = new Student(name, email, phone, LocalDate.parse(dob), gender);
//				Student student2 = service.saveStudentDao(student);
				Student student2 = dao.saveStudentDao(student);

				if (student2 != null) {
					System.out.println("data stored.....");
				} else {
					System.out.println("data not stored please check your code....");
				}
			}
				break;
			case 2: {
				Student[] student = dao.displayAllStudentDao();
				for (Student student2 : student) {
					if (student2 != null) {
						System.out.println(student2.getName());
						System.out.println(student2.getEmail());
						System.out.println(student2.getPhone());
						System.out.println(student2.getGender());
						System.out.println(student2.getDob());
					}
				}
			}
				break;
			case 3: {
				System.out.println("enter student id to update name");
				int id = scanner.nextInt();
				System.out.println("enter  student new  name to update");
				String name = scanner.next();
				int value = dao.updateStudentNameByStudentIdDao(name, id);

				if (value == 1) {
					System.out.println("Data updated");
				} else {
					System.out.println("Id is invalid");
				}

				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Enter ypur optino");
				int option = scanner.nextInt();
				System.out.println("1.Update Name\n2.update Email\n3.Update Dob");

				switch (option) {

				case 1: {
					System.out.println("Enter id to Update Name");
					String Name = scanner.next();
					dao.updateStudentNameByStudentIdDao(Name, option);

				}
					break;
				case 2: {
					System.out.println("enter ");

				}
					break;
				case 3: {

				}
					break;
				case 4: {

				}
					break;
				}

			}
				break;
			case 4: {
				System.out.println("enter student id to delete student");
				int id = scanner.nextInt();

				int value = dao.deleteStudentByIdDao(id);

				if (value == 1) {
					System.out.println("data deleted");
				} else {
					System.out.println("Id is invalid");
				}

			}
				break;
			case 5: {

			}
				break;

			}
		}

	}

}
