package com.exceptionhandling02.customexception01;

import java.util.Scanner;

public class MainClass_03 {

	public static void main(String[] args) {
		
		// Create an Object Of Account Class
		Account_02 account = new Account_02();
				
	System.out.println("Before Withdraw Current Balance :" + account.balance());
		
		// Create Scanner Object 
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Amount");
		int amount = scan.nextInt();
		 account.withdraw(amount);
		
	System.out.println("After Withdraw Current Balance :" + account.balance());

	}
 }
