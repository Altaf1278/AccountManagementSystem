package com.bridgelabz.accountmanagementsystem;

public class Account {

	public String accountHolderName, accountHolderDob, accountHolderEmail;
	public long accountNumber, accountHolderMobileNumber;

	Account() {

	}

	public Account(String accountHolderName, String accountHolderDob, String accountHolderEmail) {

		this.accountHolderName = accountHolderName;
		this.accountHolderDob = accountHolderDob;
		this.accountHolderEmail = accountHolderEmail;
		this.accountNumber = accountNumber;
		this.accountHolderMobileNumber = accountHolderMobileNumber;
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

	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}

	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}

	public long getAccountHolderMobileNumber() {
		return accountHolderMobileNumber;
	}

	public void setAccountHolderMobileNumber(long accountHolderMobileNumber) {
		this.accountHolderMobileNumber = accountHolderMobileNumber;
	}

	public long getAccountNumber() {
		return accountHolderMobileNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

}
