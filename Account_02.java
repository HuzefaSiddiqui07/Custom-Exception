package com.exceptionhandling02.customexception01;

public class Account_02 {
	
	// Initialize 
	private int balance = 50000;
	
	// Create Return type method 
	public int balance () {
		
		return balance;
	}
	
	// Create Parameter Method 
	public void withdraw (int amount) {
		
		if (amount > balance) {
			
		throw new InsufficientFundException_01("Insufficient balance in your account.");
		}
		balance = balance - amount;
	}

}
