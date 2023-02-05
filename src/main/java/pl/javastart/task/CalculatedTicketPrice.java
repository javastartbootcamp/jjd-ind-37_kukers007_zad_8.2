package pl.javastart.task;

import java.util.Objects;

public class CalculatedTicketPrice {

    double calculatedTicketPrice(Ticket ticket) {
        double shippingCost = 5;
        double discountForOnline = 0.95;
        double discountFiveProcent = 0.05;
        double discount = 0.97;
        double ticketPrice = ticket.getPrice();
        if (Objects.equals(ticket.getType(), "standard")) {
            return (int) ticketPrice * discount + shippingCost;
        } else if (Objects.equals(ticket.getType(), "online")) {
            return (int) ticketPrice * discountForOnline;
        } else if (Objects.equals(ticket.getType(), "gift")) {
            return (int) ticketPrice + (ticketPrice * discountFiveProcent);
        }
        return ticketPrice;
    }
}