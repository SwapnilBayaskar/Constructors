package com.SingletonPattern;

public class TestSingletonObject {

	public static void main(String[] args) {
		
		SingletonObject objSingletonObject = SingletonObject.getInstance();
		
		objSingletonObject.printMsg();
		
		objSingletonObject.getInstance();
	}

}
