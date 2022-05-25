package com.Constructor;

public class TestStudentInfo {

	public static void main(String[] args) {
		
		//Creating and calling constructor
		StudentInfo objStudentInfo = new StudentInfo(); //Calling constructor and initializing values
		
		objStudentInfo.intAge = 21;
		System.out.println("New Age is : "+objStudentInfo.intAge);

		
		objStudentInfo.printUsingMethod(); //Calling other method from class
	}

}
