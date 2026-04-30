package com;

import java.util.Scanner;

public class DriverClass {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		TrainBooking tb=new TrainBooking();
		
		boolean flag=true;
		
		do {
			System.out.println("1.Ticket Book");
			System.out.println("2.Cancel The Ticket");
			System.out.println("3.Show All");
			System.out.println("4.Show details Ticket Id");
			System.out.println("5.show Available Trains");
			System.out.println("6.Exit");
			
			System.out.print("Choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				tb.book();
				break;
			}
			case 2:{
				tb.cancel();
				break;
			}
			case 3:{
				tb.showAll();
				break;
			}
			case 4:{
				tb.showTicketDetailsID();
				break;
			}
			case 5:{
				tb.showTrain();
				break;
			}
			case 6:{
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
