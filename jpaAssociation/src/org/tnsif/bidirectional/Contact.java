package org.tnsif.bidirectional;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name=" Contact")
public class Contact implements Serializable {
 /**
  * 
  */
	private static final long serialVersionUID=1l;
	
	@Id
	private Long contactno;
	private String simtype;
	
	
	@ManyToOne
	
	
	// getter and setter 
	public Long getContactno() {
		return contactno;
	}
	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}
	public String getSimtype() {
		return simtype;
	}
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	
	// constructor
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor
	public Contact(Long contactno, String simtype) {
		super();
		this.contactno = contactno;
		this.simtype = simtype;
	}
	
	
}
