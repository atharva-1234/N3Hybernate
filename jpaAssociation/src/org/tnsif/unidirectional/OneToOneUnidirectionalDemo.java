package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		// one employee
		Employee emp1=new Employee();
		emp1.setEmpname("Atharva Shirole");
		
		// second employee
		Employee emp2=new Employee();
		emp2.setEmpname("ganesh");
		
		// first address
		Adress a1=new Adress();
		a1.setPincode(422401);
		a1.setArea("Nashik");
		a1.setState("Maharashtra");
		
		// 2nd address
				Adress a2=new Adress();
				a2.setPincode(422420);
				a2.setArea("Pune");
				a2.setState("Maharashtra");
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();
	}

}
