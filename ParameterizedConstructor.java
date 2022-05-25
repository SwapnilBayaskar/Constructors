package com.Constructor;

public class ParameterizedConstructor {
	
	String strCarName;
	String strBrandName;
	float floatPrice;
	
	public ParameterizedConstructor(String strCarName, String strBrandName, float floatPrice) {
		
		this.strCarName = strCarName;
		this.strBrandName = strBrandName;
		this.floatPrice = floatPrice;
		
		System.out.println("Name of the Car : "+strCarName);
		System.out.println("Name of the Brand : "+strBrandName);
		System.out.println("Price of the Car : "+floatPrice);
	}

}
