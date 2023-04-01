package com.bridgelabz.accountmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement {
	Account account = new Account();
	Scanner input = new Scanner(System.in);
	List<Account> accounts = new ArrayList<>();

	public void addAccount() {
		System.out.println("Enter account holder name: ");
		String accountHolderName = input.nextLine();
		account.setAccountHolderName(accountHolderName);

		System.out.println("Enter account holder DOB: ");
		String accountHolderDob = input.nextLine();
		account.setAccountHolderDob(accountHolderDob);

		System.out.println("Enter account holder email: ");
		String accountHolderEmail = input.nextLine();
		account.setAccountHolderEmail(accountHolderEmail);

		System.out.println("Enter account holder mobile number: ");
		long accountHolderMobileNumber = input.nextLong();
		account.setAccountHolderMobileNumber(accountHolderMobileNumber);

		System.out.println("Enter account number: ");
		long accountNumber = input.nextLong();
		account.setAccountNumber(accountNumber);

		accounts.add(account);
		System.out.println("Account information added successfully!");
	}

	public void displayAccountDetails() {
		if (accounts.isEmpty()) {
			System.out.println("Account Info Is Empty");
		}
		System.out.println("Account Management");
		for (Account account : accounts) {
			System.out.println(account.getAccountHolderName());
			System.out.println(account.getAccountHolderDob());
			System.out.println(account.getAccountHolderEmail());
			System.out.println(account.getAccountHolderMobileNumber());
			System.out.println(account.getAccountNumber());
		}
	}

}
