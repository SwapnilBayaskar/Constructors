package com.FacebookSignUp;

public class TestSignUpPage {

	public static void main(String[] args) {
		
		SignUpPage objSignUpPage = new SignUpPage("https://www.facebook.com/r.php");
		
		objSignUpPage.setFirstname("Rahul");
		objSignUpPage.setSurname("Patil");
		objSignUpPage.setMobileNum(1234123412);
		objSignUpPage.setPassword("Admin123");
		objSignUpPage.setDOB("1 Jan 1998");
		objSignUpPage.setGender("Male");

	}

}
