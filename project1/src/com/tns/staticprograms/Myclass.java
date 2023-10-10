
package com.tns.staticprograms;
//program to demonstrate static method and block
public class Myclass {
	
	private int section; // instance variable
	private static int srNo;//static variable
	
	//stativ block
	static {
		System.out.println("---Staticblock---");
		srNo=1000;
	}
	//default constructor
	Myclass() {
		System.out.println("---default constructor---");
		srNo++;
		section++;
	}
	void hello(){
		srNo++;
	}
	
	//static method
	static void display() {
		//System.out.println("seection"+section);
	System.out.println("serialNo"+srNo);
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
}