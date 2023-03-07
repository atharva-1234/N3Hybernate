package org.tnif.dao;

import javax.persistence.EntityManager;

import tnsif.org.entites.Student;

public class StudentDaoImpl implements StudentDao{
	private EntityManager em;
	
	
	

	public StudentDaoImpl() {
		em=JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		em.persist(student);
	}

	@Override
	public Student getStudent(int rollno) {
		// TODO Auto-generated method stub
		Student student=em.find(Student.class, rollno);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		em.merge(student);
		
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		em.remove(student);
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
	}
	

}
