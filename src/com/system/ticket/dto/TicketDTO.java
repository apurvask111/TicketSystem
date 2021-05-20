package com.system.ticket.dto;

public class TicketDTO {

	private String source;
	private String destination;
	private int kms;
	private int noOfTravellers;
	private int total;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public int getNoOfTravellers() {
		return noOfTravellers;
	}
	public void setNoOfTravellers(int noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	/*
	 * If ticket format changes, only this method will be modified.
	 */
	public void display() {
		System.out.println("Taxi Ticket");
		System.out.println("-------------");
		System.out.println("Source: "+ this.source);
		System.out.println("Destination: "+ this.destination);
		System.out.println("Kms: "+ this.kms);
		System.out.println("No. of travellers = "+ this.noOfTravellers);
		System.out.println("Total = "+ this.total);
	}
	
}
