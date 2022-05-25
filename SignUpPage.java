package com.FacebookSignUp;

public class SignUpPage {
	
	public SignUpPage(String strURL) { //Parameterized Constructor
		
		System.out.println("URL for Sign Up on Facebook : "+strURL);
	}
	
	
	public void setFirstname(String strFirstname) {
		
		System.out.println("First Name is : "+strFirstname);
	}
	
	public void setSurname(String strSurname) {
		
		System.out.println("Surname is : "+strSurname);
	}
	
	public void setMobileNum(int intNumber) {
		
		System.out.println("Mobile Number is : "+intNumber);
	}
	
	public void setPassword(String strPassword) {
		
		System.out.println("Password is : "+strPassword);
	}
	
	public void setDOB(String strDOB) {
		
		System.out.println("Date of Birth is : "+strDOB);
	}
	
	public void setGender(String strGender) {
		
		System.out.println("Gender is : "+strGender);
	}

}
