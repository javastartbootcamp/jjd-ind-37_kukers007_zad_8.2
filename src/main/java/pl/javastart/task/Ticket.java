package pl.javastart.task;

public class Ticket {
    private String event;
    private Adress adress;
    private double price;
    private String type;
    private double discount;
    private static int ticketNo = 0;
    private int countTicket;

    public Ticket(String event, Adress adress, double price, String type, double discount) {
        ticketNo++;
        this.event = event;
        this.adress = adress;
        this.price = price;
        this.type = type;
        this.discount = discount;
        this.countTicket = ticketNo;
    }

    public Ticket() {
        ticketNo++;
        countTicket = ticketNo;

    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public static void setTicketNo(int ticketNo) {
        Ticket.ticketNo = ticketNo;
    }

    public int getCountTicket() {
        return countTicket;
    }

    public void setCountTicket(int countTicket) {
        this.countTicket = countTicket;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    void printInfo() {
        System.out.println("Event type: " + event);
        System.out.println("Ticket type: " + type);
        System.out.println("Your ticket ID: " + Ticket.ticketNo);
        System.out.println("Event location:");
        System.out.println("Country: " + adress.getCountry());
        System.out.println("City: " + adress.getCity());
        System.out.println("Street: " + adress.getStreet() + "Street No: " + adress.getStreetNo() + " House No: " + adress.getHouseNr());
        System.out.println("Zip code: " + adress.getZipCode());
        System.out.println("Ticket discount :" + discount);
        System.out.println("Regular ticket price: " + price);
    }
}
