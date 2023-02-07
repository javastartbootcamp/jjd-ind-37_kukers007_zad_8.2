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
        System.out.println("Enter ticket discount");
        ticket.setDiscount(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Podaj typ biletu:");
        System.out.println(Ticket.TYPE_ONLINE + " " + Ticket.TYPE_GIFT + " " + Ticket.TYPE_STANDARD);
        ticket.setType(scanner.nextLine());
        ticket.setAdress(adress);
        return ticket;
    }
}