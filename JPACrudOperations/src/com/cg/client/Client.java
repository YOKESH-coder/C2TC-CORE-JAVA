package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {
	
	public static void main(String args[]) {
		Student student = new Student();
		StudentService service = new StudentServiceImpl();
		
		/*
		 * //Create student.setStudentId(103); student.setName("Akshaya");
		 * service.addStudent(student); System.out.println("Student details are added");
		 */
		
		/*
		 * //Retrieve service.getStudentById(103);
		 * System.out.println(student.getStudentId());
		 * System.out.println(student.getName());
		 */
		
		/*
		 * //update student = service.getStudentById(102); student.setName("Priyanka");
		 * service.updateStudent(student);
		 * System.out.println("Student data is updated");
		 */
		
		
		//Delete service.removeStudent(student);
		student = service.getStudentById(100);
		service.removeStudent(student);
		System.out.println("Student data is deleted");
		 
	}	
}
