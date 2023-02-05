package pl.javastart.task;

public class Ticket {
    private String event;
    private Adress adress;
    private double price;
    private String type;
    static int ticketNo;

    public Ticket(String event, Adress adress, double price, String type) {
        this.event = event;
        this.adress = adress;
        this.price = price;
        this.type = type;
        ticketNo++;
    }

    public Ticket() {
        ticketNo++;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void printInfo() {
        System.out.println("Event type: " + event);
        System.out.println("Ticket type: " + type);
        System.out.println("Your ticket ID: " + ticketNo);
        System.out.println("Event location:");
        System.out.println("Country: " + adress.getCountry());
        System.out.println("City: " + adress.getCity());
        System.out.println("Street: " + adress.getStreet() + "Street No: " + adress.getStreetNo() + " House No: " + adress.getHouseNr());
        System.out.println("Zip code: " + adress.getZipCode());
        System.out.println("Regular ticket price: " + price);
    }
}
