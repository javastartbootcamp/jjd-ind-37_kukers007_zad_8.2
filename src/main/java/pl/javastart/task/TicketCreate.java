package pl.javastart.task;

import java.util.Scanner;

public class TicketCreate {

    static Ticket create() {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket4 = new Ticket();
        Adress adress4 = new Adress();
        System.out.println("Enter event´s name: ");
        ticket4.setEvent(scanner.nextLine());
        System.out.println("Where is a event ?");
        System.out.println("Enter country: ");
        adress4.setCountry(scanner.nextLine());
        System.out.println("Enter city: ");
        adress4.setCity(scanner.nextLine());
        System.out.println("Enter Street");
        adress4.setStreet(scanner.nextLine());
        System.out.println("Enter street No");
        adress4.setStreetNo(scanner.nextInt());
        System.out.println("Enter ticket price");
        ticket4.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj typ biletu:");
        System.out.println("online / standard / gift");
        ticket4.setType(scanner.nextLine());
        return new Ticket(ticket4.getEvent(), adress4, ticket4.getPrice(), ticket4.getType());
    }
}