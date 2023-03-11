package org.tnsif.unidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")

public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer empid;
private String empname;



@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="Pincode")
private Adress address;

// getter and setter 

public Integer getEmpid() {
	return empid;
}

public void setEmpid(Integer empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public Adress getAddress() {
	return address;
}

public void setAddress(Adress address) {
	this.address = address;
}
// constructor  default 

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
// constructor using fields 
public Employee(Integer empid, String empname, Adress address) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.address = address;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + "]";
}







}
