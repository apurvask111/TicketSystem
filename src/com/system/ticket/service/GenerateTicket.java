package com.system.ticket.service;

import java.util.Scanner;

import com.system.ticket.dto.TicketDTO;

public class GenerateTicket {

	public static void main(String[] args) {
		TicketDTO ticketInformation = new TicketDTO();
		GenerateTicket createTicket = new GenerateTicket();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Source = ");
		ticketInformation.setSource(scanner.nextLine());
		System.out.print("Destination = ");
		ticketInformation.setDestination(scanner.nextLine());
		System.out.print("Travellers = ");
		ticketInformation.setNoOfTravellers(scanner.nextInt());
		scanner.close();

		ticketInformation.setKms(createTicket.getDistance(ticketInformation));
		ticketInformation.setTotal(createTicket.calculateFare(ticketInformation));

		ticketInformation.display();
	}

	private int getDistance(TicketDTO ticketDTO) {
		int distance = 0;
		switch (ticketDTO.getSource()) {
		case "PUNE":
			switch (ticketDTO.getDestination()) {
			case "MUMBAI":
				distance = 120;
				break;

			case "NASIK":
				distance = 200;
				break;

			default:
				break;
			}
			break;

		case "MUMBAI":
			switch (ticketDTO.getDestination()) {
			case "GOA":
				distance = 350;
				break;

			case "NASIK":
				distance = 180;
				break;

			case "PUNE":
				distance = 120;
				break;

			default:
				break;
			}
			break;

		case "NASIK":
			switch (ticketDTO.getDestination()) {
			case "PUNE":
				distance = 200;
				break;

			case "MUMBAI":
				distance = 180;
				break;

			default:
				break;
			}
			break;

		case "GOA":
			if(ticketDTO.getDestination().equals("MUMBAI")) distance = 350;

			break;

		default:
			break;
		}

		return distance;
	}

	private int calculateFare(TicketDTO ticketDTO) {
		int fare = 0;

		if(ticketDTO.getKms() <= 100) {
			fare = 750;
		}else {
			int extra = ticketDTO.getKms()-100;
			fare = 750 + (extra*5);
		}
		fare = fare*ticketDTO.getNoOfTravellers();

		return fare;
	}


}
