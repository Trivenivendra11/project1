package com.tns.exception;

import java.util.InputMismatchException;

public class WithExceptions {
public static void divide() {
	int a=6 ,b=0,c;
	try {
		c=a/b;
	}
	catch(ArithmeticException e) {
		System.out.println("Exception Caught"+e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception Caught"+e.getMessage());
}
	catch(InputMismatchException e) {
		System.out.println("Exception Caught"+e.getMessage());
}
	finally {
		System.out.println("this will be executed");
	
	}
}
}