package org.tnsif.service;

import tnsif.org.entites.Student;

public interface StudentService {
	void add(Student student);
	void update (Student student);
	void delete (Student student);
	Student  get (int rollno);

}
