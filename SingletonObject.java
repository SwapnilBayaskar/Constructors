package com.SingletonPattern;

public class SingletonObject {
	
	private static SingletonObject objInstance = new SingletonObject();
	
	private SingletonObject() { //Private Constructor
		
	}
	
	public static SingletonObject getInstance() {
		
		if(objInstance == null) {
			objInstance = new SingletonObject();
		}
		return objInstance;
	}
	
	public void printMsg() {
		System.out.println("Welcome to Singleton Pattern !");
	}

}
