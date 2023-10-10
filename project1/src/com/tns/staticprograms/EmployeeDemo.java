
package com.tns.staticprograms;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee("triveni",1146);
		System.out.println(ob);		 // accessing the static variable using classname
		Employee companyName;
		ob=new Employee("Adi",1643);
		System.out.println(ob);
		}

}