package com;

public class BanckAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;

	
	
	
	public void createAccount(int acc,String name,double userbalance) {
		accountNumber=acc;
		accountHolder=name;
		balance=userbalance;
		System.out.println("Account Created");
	}
	
	public void deposite(double deposite) {
		if (deposite>0) {
			balance+=deposite;
			System.out.println("Ammount deposite successfully");
			
		}
		else {
			System.out.println("Invalid deposite");
		}
	}
	
	public void withdraw(double amount) {
		if (amount<=balance && amount>0) {
			balance-=amount;
			System.out.println("Withdraw successfully");
			
		}
		else {
			System.out.println("insufficient Balance");
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
		
	

}
