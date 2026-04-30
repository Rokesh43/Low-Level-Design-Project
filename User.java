package com;

import java.util.ArrayList;
import java.util.List;

public class User {
	int userId;
	String Username;
	int age;
	long phone;
	
	List<Product> cart=new ArrayList<Product>();
	
	
	public User(int userId, String username, int age, long phone) {
		super();
		this.userId = userId;
		Username = username;
		this.age = age;
		this.phone = phone;
	}
	
	

}
