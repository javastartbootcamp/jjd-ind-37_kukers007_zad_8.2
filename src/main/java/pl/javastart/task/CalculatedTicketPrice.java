package pl.javastart.task;

import java.util.Objects;

public class CalculatedTicketPrice {
    static final double SHIPPING_COST = 5;
    static final double REGULAR_DISCOUNT_FOR_ONLINE = 0.95;
    static final double DISCOUNT_FIVE_PROCENT = 0.05;
    static final double NORMAL_DISCOUNT = 0.97;
    double normalPrice;
    double standardTicketPrice;
    double onlineTicketPrice;
    double giftTicketPrice;

    double calculatedTicketPrice(Ticket ticket) {
        normalPrice = ticket.getPrice();

        if (Objects.equals(ticket.getType(), "standard")) {
            standardTicketPrice = normalPrice * NORMAL_DISCOUNT + SHIPPING_COST;
            System.out.println("Standardticket price for You: " + (int) standardTicketPrice);
            return (int) standardTicketPrice;

        } else if (Objects.equals(ticket.getType(), "online")) {
            onlineTicketPrice = normalPrice * REGULAR_DISCOUNT_FOR_ONLINE;
            System.out.println("Onlineticket price for You: " + (int) onlineTicketPrice);
            return (int) onlineTicketPrice;

        } else if (Objects.equals(ticket.getType(), "gift")) {
            giftTicketPrice = standardTicketPrice + (normalPrice * DISCOUNT_FIVE_PROCENT);
            System.out.println("Giftticket price for You: " + (int) giftTicketPrice);
            return (int) giftTicketPrice;
        }

        System.out.println("Your choose a wrong ticket type.");
        return 0;
    }
}