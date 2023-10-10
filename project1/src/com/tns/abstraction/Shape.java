	package com.tns.abstraction;
	//program to demonstrate abstraction in java
	//Abstract class
	public abstract class Shape {
		protected float area;
		// Abstract method
		abstract void calArea() ;
		void show()  {// concrate method
			System.out.println("area of shape in"+area);
		}

	}