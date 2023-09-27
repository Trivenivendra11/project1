package com.tns.scanner;
//entity class
public class person {
private String name;
private int income;
private int tax;
//getters and setters are used to protect data
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIncome() {
	return income;
}
public void setIncome(int income) {
	this.income = income;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
//help you to print object in string format
@Override
public String toString() {
	return "person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
}
}


