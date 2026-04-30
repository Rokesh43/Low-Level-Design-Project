package com;

public class Train {
	private String trainNo;
	private String trainName,from,to,departure,arrival;
	
	
	public Train(String trainNo, String trainName, String from, String to, String departure, String arrival) {
		
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.from = from;
		this.to = to;
		this.departure = departure;
		this.arrival = arrival;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	
	
	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName + ", from=" + from + ", to=" + to
				+ ", departure=" + departure + ", arrival=" + arrival + "]";
	}
	
	
	public void showTrain() {
		System.out.println("Train Number :"+trainNo);
		System.out.println("Train Name :"+trainName);
		System.out.println("From - TO:"+from+" ===> "+to);
		System.out.println("Depature :"+departure+" | Arrival :"+arrival);
	
	}

}
