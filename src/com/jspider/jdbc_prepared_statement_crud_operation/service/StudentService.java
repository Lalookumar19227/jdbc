package com.jspider.jdbc_prepared_statement_crud_operation.service;

import com.jspider.jdbc_prepared_statement_crud_operation.dao.StudentDao;
import com.jspider.jdbc_prepared_statement_crud_operation.dto.Student;

public class StudentService {

	
	StudentDao dao = new StudentDao();
	
	public Student saveStudentDao(Student student) {
		
		
		if(student.getName().length()<=8) {
			return dao.saveStudentDao(student);
		}else {
			return null;
		}
	}
	
	
	
}