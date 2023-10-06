
package com.tns.Inheritance;
public class Student extends Citizen {
	
	private int rollno;
	private String collegename;
	// default constructor
	public Student() {
		super();
	}
// constructor from super class
	public Student(String name, long aadharno, String address, long phno) {
		super(name, aadharno, address, phno);
		//TODO Auto-generated constructor stub
	}
	//parameterised constructor
	public Student(int rollno, String collegename) {
		super();
		this.rollno = rollno;
		this.collegename = collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
//@override
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
}

}