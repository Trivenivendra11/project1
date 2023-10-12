package com.tns.exception;

public class NestedTry {
	public static void check()	{
	String str="tns";
	int slength=str.length();
	System.out.println("the length of the string is"+slength);
	String anotherString="hello";
	int y=6;
	try { //outer try
		int z=y/0;
		try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("IndexOut of bound"+ex.getMessage());
		}
	}
		catch(ArithmeticException ex) {
			System.out.println("ArithmeticException"+ex.getMessage());
		
	}
	}
}
	

	
	


