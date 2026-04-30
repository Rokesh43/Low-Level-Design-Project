package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrainBooking {
	static List<Ticket> list=new ArrayList<Ticket>();
	static Scanner sc=new Scanner(System.in);
	
	static List<Train> trainList=Arrays.asList(new Train("MAd66254","Chennai Express","Chennai","Coimbatore","10.00Am","9.00PM"),new Train("RAd66224","Covai Express","Coimbatore","Chennai","11.00Am","8.00PM"),new Train("DAd66254","Bengaluru Express","Chennai","Bengaluru","6.00Am","8.00PM"));
	
	public void showTrain() {
		System.out.println("Available Train Details");
		for(int i=0;i<trainList.size();i++) {
			System.out.println("["+(i+1)+"]");
			trainList.get(i).showTrain();
		}
	}
	
	
	public void book() {
		showTrain();
		System.out.println("Select Train 1 to "+trainList.size());
		int choice=Integer.parseInt(sc.next())-1;
		
		if (choice<0 || choice>trainList.size()) {
			System.out.println("Invalid Train select");
			return;
			
		}
		
		
		System.out.print("Enter the name :");
		String name=sc.next();
		System.out.print("Enter the age");
		int age=sc.nextInt();
		System.out.print("Enter the phone number :");
		long phone=sc.nextLong();
		
		
		Ticket t=new Ticket(new Passenger(name,age,phone),trainList.get(choice));
		
		list.add(t);
		
		System.out.println("Conformed "+t.ticketId);
		
	}
	public void cancel() {
		System.out.print("Enter the Ticket Id :");
		String id=sc.next();
		
		for(Ticket t:list) {
			if (t.ticketId.equalsIgnoreCase(id)) {
				if (t.status.equals("Cancelled")) {
					System.out.println("Already Cancelled");
					
				}
				else {
					t.status="Cancelled";
					System.out.println("Ticket "+id+" cancelled");
				}
				
			}
			else {
				System.out.println("Ticket Id Not found");
			}
		}
	}
	
	public void showAll() {
		if (list.isEmpty()) {
			System.out.println("Ticket Not Found");
			
		}
		else {
			for(Ticket t:list) {
				t.ticketShow();
			}
		}
	}
	
	public void showTicketDetailsID() {
		if (list.isEmpty()) {
			System.out.println("Ticket not found");
			
		}
		else {
			System.out.print("Enter the Ticket Id :");
			String id=sc.next();
			
			for(Ticket t:list) {
				if (t.ticketId.equalsIgnoreCase(id)) {
					t.ticketShow();
					
				}
			}
		}
	}

}
