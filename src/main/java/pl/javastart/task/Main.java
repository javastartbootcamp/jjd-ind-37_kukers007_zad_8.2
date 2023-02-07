package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        TicketPriceCalculator calc1 = new TicketPriceCalculator();

        Adress adress1 = new Adress("Poland", "Lublin", "Zygmuntowskie", 33, "20-066");
        Adress adress2 = new Adress("Japan", "Tokyo", "Shinbuz", 222, "007-7776");
        Adress adress3 = new Adress("Germany", "Nümberg", "RomantischeStr.", 54, "98-999");

        Ticket ticket1 = new Ticket("Soccer Game", adress1, 100, Ticket.TYPE_STANDARD, 0.1);
        ticket1.printInfo();
        System.out.println("Price for ticket: " + calc1.ticketPriceCalculator(ticket1));
        System.out.println("------");

        Ticket ticket2 = new Ticket("Concert", adress2, 80, Ticket.TYPE_ONLINE, 0.1);
        ticket2.printInfo();
        System.out.println("Price for ticket: " + calc1.ticketPriceCalculator(ticket2));
        System.out.println("------");

        Ticket ticket3 = new Ticket("Bier trinken und würst essen", adress3, 80, Ticket.TYPE_GIFT, 0.1);
        ticket3.printInfo();
        System.out.println("Price for ticket: " + calc1.ticketPriceCalculator(ticket3));
        System.out.println("------");

        Ticket ticket = TicketCreate.create();
        ticket.printInfo();
        System.out.println("Price for ticket: " + calc1.ticketPriceCalculator(ticket));
        System.out.println("------");
    }
}
