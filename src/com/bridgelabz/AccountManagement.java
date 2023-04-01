package com.bridgelabz;

import java.util.Scanner;

public class AccountManagement extends Account{
	Scanner sc = new Scanner(System.in);
	private String accountHolderEmail;

	public void addAccountDetails() {
		
			System.out.println("Enter 1 : Create Contact.");
			System.out.println("Enter your Choice =>");
			int accountDetails = sc.nextInt();
			
			if (accountDetails == 1) {
					System.out.println("Creating Contact....");
					
					System.out.println("Enter the account Number =>");
					int accountNumber = sc.nextInt();
					
					System.out.println("Enter the account Holder name =>");
					String accountHolderName =sc.next();
					
					System.out.println("Enter the account Holder date of birth =>");
					String accountHolderDob = sc.next();
					
					System.out.println("Enter the account Holder mobile number =>");
					String accountHolderMobileNumber = sc.next();
					
					System.out.println("Enter the account Holder Email =>");
					String accountHolderEmail = sc.nextLine();
					}
					
			}
			
			public void displayAccountDetails(){
				Account addAccountDetails = new Account();
				
				System.out.println("Details of acoount holder is =>");
				System.out.println(addAccountDetails.getAccountNumber());
				System.out.println(addAccountDetails.getAccountHolderName());
				System.out.println(addAccountDetails.getAccountHolderDob());
				System.out.println(addAccountDetails.getAccountHolderMobileNumber());
				System.out.println(addAccountDetails.getAccountHolderEmail());
			
				
			}
}
