package com.tns.constructorprog1;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
			String name,city;
			int id;
			System.out.println("enter customer id");
			id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("enter a name");
			name=sc.nextLine();
			
			System.out.println("enter city");
			city=sc.nextLine();
			Customer c1=new Customer();
			c1.setCustomerId(id);
			c1.setCustomerName(name);
			c1.setCustomerCity(city);
			System.out.println(c1);


	}

}
