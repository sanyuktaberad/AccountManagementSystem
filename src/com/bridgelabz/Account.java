package com.bridgelabz;

//Account  accountNumber, accountHolderName, accountHolderDob, accountHolderMobileNumber, accountHolderEmail
//AccountManagement addAccountDetails(), displayAccountDetails()
//AccountManagementMain call addAccountDetails(), displayAccountDetails() methods

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private String accountHolderDob;
	private String accountHolderMobileNumber;
	private String accountHolderEmail;

	Account(){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountHolderDob = accountHolderDob;
		this.accountHolderMobileNumber = accountHolderMobileNumber;
		this.accountHolderEmail = accountHolderEmail;
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountHolderDob() {
		return accountHolderDob;
	}

	public void setAccountHolderDob(String accountHolderDob) {
		this.accountHolderDob = accountHolderDob;
	}

	public String getAccountHolderMobileNumber() {
		return accountHolderMobileNumber;
	}

	public void setAccountHolderMobileNumber(String accountHolderMobileNumber) {
		this.accountHolderMobileNumber = accountHolderMobileNumber;
	}

	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}

	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}
	
}