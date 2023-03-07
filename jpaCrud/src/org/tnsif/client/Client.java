package org.tnsif.client;

import org.tnsif.service.StudentService;
import org.tnsif.service.StudentServiceImpl;

import tnsif.org.entites.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService service = new StudentServiceImpl();

		Student student = new Student();
		// Create Operation
		student.setRollno(100);
		student.setName("Sachin");
		service.add(student);
		

		student = service.get(100);
		System.out.print("ID:"+student.getRollno());
		System.out.println(" Name:"+student.getName());
		
		student = service.get(100);
		student.setName("Sachin Tendulkar");
		service.update(student);
		
		student = service.get(100);
		System.out.print("ID:"+student.getRollno());
		System.out.println(" Name:"+student.getName());
		
		student = service.get(100);
		service.delete(student);
		System.out.println("End of program/Life cycle completed...");
	}

}
