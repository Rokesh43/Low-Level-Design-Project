package com;

public class Ticket {
	Passenger p;
	Train t;
	String ticketId,status;
	
	Ticket(Passenger p,Train t){
		this.p=p;
		this.t=t;
		this.ticketId="TKT"+(int)(Math.random()*9999+9999);
		this.status="Conformed";
	}
	
	public void ticketShow() {
		System.out.println("Ticket Id :"+ticketId);
		System.out.println("Status :"+status);
		System.out.println("------Train Details-----");
		t.showTrain();
		System.out.println("------Passenger Details------");
		System.out.println("Name :"+p.getName());
		System.out.println("Age :"+p.getAge());
		System.out.println("Phone :"+p.getPhone());
		
	}

}
