package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DriverClass {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		List<User> users=new ArrayList<User>();
		
		boolean flag=true;
		int usercount=0;
		
		do {
			System.out.println("1.Add User");
			System.out.println("2.Select User");
			System.out.println("3.Exit");
			System.out.print("choice :");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.print("Enter the name:");
				String name=sc.next();
				
				System.out.print("Enter the age :");
				int age=sc.nextInt();
				
				System.out.print("Enter the Phone number :");
				long phone=sc.nextLong();
				
				User user=new User(++usercount, name, age, phone);
				
				users.add(user);
				
				System.out.println("User added Successfully");
				break;
				
				
			}
			case 2:{
				if (users.isEmpty()) {
					System.out.println("No users");
					break;
					
				}
				
				for(int i=0;i<users.size();i++) {
					System.out.println(users.get(i).userId+" "+users.get(i).Username);
					
				}
				
				System.out.println("Select the user :");
				int idx=sc.nextInt()-1;
				
				if (idx>=users.size()) {
					System.out.println("Invalid User select!");
					break;
					
				}
				
				User u=users.get(idx);
				
				boolean back=true;
				do {
					System.out.println("1.Add Product");
					System.out.println("2.VeiwCart");
					System.out.println("3.Checkout");
					System.out.println("4.Back");
					
					System.out.println("Choice :");
					int input=sc.nextInt();
					switch(input) {
					case 1:{
						System.out.println("Enter the ID :");
						String id=sc.next();
						System.out.println("Enter the product name:");
						String name=sc.next();
						System.out.println("Enter the price :");
						double price=sc.nextDouble();
						
						u.cart.add(new Product(id,name,price));
						
						System.out.println("Product is Added");
						break;
						
						
					}
					case 2:{
						double total=0;
						for(Product p:u.cart) {
							System.out.println(p.name+" "+p.price);
							total+=p.price;
						}
						System.out.println("Total price :"+total);
						break;
					}
					case 3:{
						System.out.println("Order Placed!");
						u.cart.clear();
						break;
					}
					case 4:{
						back=false;
						break;
					}
					default:{
						System.out.println("Invalid Selection");
						break;
					}
					}
				} while (back);
			}
			case 3:{
				flag=false;
			}
			default:{
				System.out.println("Invalid Selecton");
			}
			}
			
		} while (flag);
	}

}
