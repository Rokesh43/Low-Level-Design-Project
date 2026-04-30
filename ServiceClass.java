package com;

import java.util.HashMap;
import java.util.Scanner;

public class ServiceClass {
	static Scanner sc=new Scanner(System.in);
	Validation v=new Validation();
	
	private HashMap<String, User> user=new HashMap<String, User>();
	
	public void signin(String username,String password,String conformedpassword) {
		if (!v.isValidUserName(username)) {
			System.out.println("User name not valid");
			return;
			
		}
		
		if (!v.isValidPassword(password)) {
			System.out.println("Invalid Password must be 6+ character letters with Number");
			return;
			
		}
		
		if (user.containsKey(username)) {
			System.out.println("User already Exists");
			return;
			
		}
		if (!password.equals(conformedpassword)) {
			System.out.println("Password is Not Match");
			return;
			
		}
		if (!otpverify()) {
			System.out.println("Not otp match");
			return;
			
		}
		
		user.put(username, new User(username,password));
		System.out.println("Sign up Successfully");
		
		
		
		
	}
	
	
	public void login(String username,String password) {
		if (!user.containsKey(username)) {
			System.out.println("User not Found");
			return ;
		}
		
		User users=user.get(username);
		
		if (!users.getPassword().equals(password)) {
			System.out.println("Password is not match");
			return;
			
		}
		
		if (!otpverify()) {
			System.out.println("Otp is not match");
			return;
			
		}
		
		System.out.println("Login Sucessfull");
		
	}
	public boolean otpverify() {
		int otp=(int)(Math.random()*9999+9999);
		
		System.out.println("Otp :"+otp);
		System.out.println("Enter the otp :");
		int userOtp=sc.nextInt();
		
		return userOtp==otp;
		
		
	}

}
