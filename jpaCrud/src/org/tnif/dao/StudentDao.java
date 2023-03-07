package org.tnif.dao;

import tnsif.org.entites.Student;

public interface StudentDao {
	void addStudent(Student student); // creation
	Student getStudent (int rollno); // Retrieve
	void updateStudent(Student student); // update
	void removeStudent(Student student); // delete
	
	
	void beginTransaction();
	void commitTransaction();
	

}
