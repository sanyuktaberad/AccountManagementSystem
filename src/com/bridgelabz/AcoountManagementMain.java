package com.bridgelabz;

public class AcoountManagementMain {
	
	public static void main(String[] args) {
		AccountManagement addAccountDetails = new AccountManagement();
		
		System.out.println("For creatingacouunt Details");
		addAccountDetails.addAccountDetails();
		
		System.out.println("For Displaying Details");
		addAccountDetails.displayAccountDetails();
	}

}
