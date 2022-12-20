package com.exceptionhandling02.customexception01;

// Create Custom Exception Class By User-Defined 
public class InsufficientFundException_01 extends RuntimeException{
	
	// Global Variable Declare
	private String message;
	
	// Create Parameterized Constructor
	public InsufficientFundException_01(String message) {
		
		super(message);
		
	}

}
