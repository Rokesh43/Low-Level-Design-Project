package com;
import java.util.*;
public class MainClassBank {
	static Scanner sc=new Scanner (System.in);
	
	
	public static void main(String[] args) {
		
		BanckAccount  account=new BanckAccount();
		boolean accountCreated=false;
		
		boolean flag=true;
		
		
		do {
			System.out.println("1.Bank Account");
			System.out.println("2.Deposite");
			System.out.println("3.Withdraw");
			System.out.println("4.GetBalance");
			System.out.println("5.GetAccountNumber");
			System.out.println("6.GetAccountHolder");
			System.out.println("7.SetAccountHolder");
			System.out.println("8.Exit");
			
			
			System.out.print("Enter Here :");
			int input=sc.nextInt();
			
			
			
			switch(input) {
			case 1->{
				System.out.print("Enter the account number :");
				int accountNumber=sc.nextInt();
				System.out.print("Enter the account holder name :");
				String name=sc.next();
				System.out.print("Enter the Balance");
				double balance=sc.nextDouble();
				
				account.createAccount(accountNumber, name, balance);
				accountCreated=true;
				
			}
			
			case 2->{
				if(accountCreated) {
					System.out.print("Enter the deposite amount");
					double deposite=sc.nextDouble();
					account.deposite(deposite);
					
				}
				else {
					System.out.println("Account create first");
				}
				
			}
			case 3->{
				if (accountCreated) {
					System.out.println("Enter the withdraw amount");
					double amount=sc.nextDouble();
					
					account.withdraw(amount);
					
				}
				else {
					System.out.println("Account create first");
				}
				
				
				
			}
			case 4->{
				if (accountCreated) {
					
					System.out.println(account.getBalance());
					
				}
				else {
					System.out.println("Account create first");
				}
				
				
			}
			case 5->{
				if (accountCreated) {
					System.out.println(account.getAccountNumber());
					
				}
				else {
					System.out.println("Account create first");
				}
			
			}
			case 6->{
				if (accountCreated) {
					System.out.println(account.getAccountHolder());
					
				}
				else {
					System.out.println("Account create first");
				}
				
				
			}
			case 7->{
				if (accountCreated) {
					System.out.print("New holder name");
					String name=sc.next();
					
					account.setAccountHolder(name);
					
				}
				else {
					System.out.println("Account create first");
				}
				
				
			}
			case 8->{
				flag=false;
				System.out.println("Thank You");
			}
			default->{
				System.out.println("Invalid Choice");
			}
			}
		} while (flag);
		
	}

}
