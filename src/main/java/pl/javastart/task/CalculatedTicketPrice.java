package pl.javastart.task;

import java.util.Objects;

public class CalculatedTicketPrice {
    static final double SHIPPING_COST = 5;
    static final double DISCOUNT_FIVE_PROCENT = 0.05;

    double calculatedTicketPrice(Ticket ticket) {
        double discount = ticket.getDiscount();
        double ticketPrice = ticket.getPrice();
        double regularPrice = ticketPrice - ticketPrice * discount;
        if (Objects.equals(ticket.getType(), "standard")) {
            return  regularPrice + SHIPPING_COST;
        } else if (Objects.equals(ticket.getType(), "online")) {
            return  regularPrice;
        } else if (Objects.equals(ticket.getType(), "gift")) {
            return regularPrice + SHIPPING_COST + (regularPrice * DISCOUNT_FIVE_PROCENT);
        }
        return ticketPrice;
    }
}