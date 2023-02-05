package pl.javastart.task;

import java.util.Scanner;

public class TicketCreate {

    static Ticket create() {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        Adress adress = new Adress();
        System.out.println("Enter event´s name: ");
        ticket.setEvent(scanner.nextLine());
        System.out.println("Where is a event ?");
        System.out.println("Enter country: ");
        adress.setCountry(scanner.nextLine());
        System.out.println("Enter city: ");
        adress.setCity(scanner.nextLine());
        System.out.println("Enter Street");
        adress.setStreet(scanner.nextLine());
        System.out.println("Enter street No");
        adress.setStreetNo(scanner.nextInt());
        System.out.println("Enter ticket price");
        ticket.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj typ biletu:");
        System.out.println("online / standard / gift");
        ticket.setType(scanner.nextLine());
        return new Ticket(ticket.getEvent(), adress, ticket.getPrice(), ticket.getType());
    }
}