package org.tnsif.service;

import org.tnif.dao.StudentDao;
import org.tnif.dao.StudentDaoImpl;

import tnsif.org.entites.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	
	

	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}

	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student get(int rollno) {
		// TODO Auto-generated method stub
		Student student=dao.getStudent(rollno);
		return student;
		
		
	}

}
