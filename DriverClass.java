package com;

import java.security.Provider.Service;
import java.util.Scanner;

public class DriverClass {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ServiceClass service=new ServiceClass();
		
		boolean flag=true;
		
		do {
			System.out.println("1.Signin");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			
			System.out.print("Choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.print("Enter the User Name :");
				String username=sc.next();
				System.out.print("Enter the Password :");
				String password=sc.next();
				System.out.print("Enter the Conforim Password :");
				String cpassword=sc.next();
				
				
				service.signin(username, password, cpassword);
				break;
			}
			case 2:{
				System.out.print("Enter the UserName :");
				String username=sc.next();
				System.out.print("Enter the Password :");
				String password=sc.next();
				
				service.login(username, password);
				break;
				
			}
			case 3:{
				flag=false;
				System.out.println("Thank You");
				break;
			}
			default:{
				System.out.println("Invalid Choice");
				break;
			}
			}
		} while (flag);
		
	}

}
