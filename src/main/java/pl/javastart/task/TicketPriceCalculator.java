package pl.javastart.task;

public class TicketPriceCalculator {
    private static final double SHIPPING_COST = 5;
    private static final double DISCOUNT_FIVE_PROCENT = 0.05;

    double ticketPriceCalculator(Ticket ticket) {
        double discount = ticket.getDiscount();
        double ticketPrice = ticket.getPrice();
        double regularPrice = ticketPrice - ticketPrice * discount;
        double priceByIncorrectType = 0.0;
        double price = switch (ticket.getType()) {
            case Ticket.TYPE_ONLINE -> regularPrice;
            case Ticket.TYPE_STANDARD -> regularPrice + SHIPPING_COST;
            case Ticket.TYPE_GIFT -> regularPrice + SHIPPING_COST + (regularPrice * DISCOUNT_FIVE_PROCENT);
            default -> priceByIncorrectType;
        };
        return price;
    }
}