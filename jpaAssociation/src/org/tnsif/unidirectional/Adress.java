package org.tnsif.unidirectional;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Adress  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID=1L;
	@Id
	private int pincode;
	private String area;
	private String state;
	
	// getter and setter 
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	// constructor
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// constructor using fields
	public Adress(int pincode, String area, String state) {
		super();
		this.pincode = pincode;
		this.area = area;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Adress [pincode=" + pincode + ", area=" + area + ", state=" + state + "]";
	}
	
	
	
	
	
	
}
