
package com.tns.Inheritance;
//program to demonstrate single Inheritance


public class Citizen {
	//attribute of class 
	private String Name;
	private long Adharno;
	private String address;
	private long phno;
	//Default constructor
	public Citizen() {
		super();
		
	}
	public Citizen(String name, long adharno, String address, long phno) {
	super();
	this.Name = name;
	this.Adharno = adharno;
	this.address = address;
	this.phno = phno;
	}
	
		
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getAdharno() {
		return Adharno;
	}
	public void setAdharno(long adharno) {
		Adharno = adharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [Name=" + Name + ", Adharno=" + Adharno + ", address=" + address + ", phno=" + phno + "]";
	}


	}