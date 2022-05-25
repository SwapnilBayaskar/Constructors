package com.Constructor;

public class StudentInfo {
	
	String strFirstName;
	String strLastName;
	int intAge;
	int intRollNo;
	
	
	public StudentInfo() { //Default Constructor
		
		strFirstName = "Rahul";
		strLastName = "Deshmush";
		intAge = 16;
		intRollNo = 312;
		
		System.out.println("======Student Details======");
		System.out.println("First Name : "+strFirstName);
		System.out.println("Last Name : "+strLastName);
		System.out.println("Age : "+intAge);
		System.out.println("Roll No. : "+intRollNo);
		
	}
	
	
	//Simple method
	public void printUsingMethod() {
		
		System.out.println("This method needs to be called using object");
		
	}
	
	

}
