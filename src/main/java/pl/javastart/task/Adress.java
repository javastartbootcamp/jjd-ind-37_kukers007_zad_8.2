package pl.javastart.task;

public class Adress {
    private String country;
    private String city;
    private String street;
    private int streetNo;
    private int houseNr;
    private String zipCode;

    public Adress(String country, String city, String street, int streetNo, int houseNr, String zipCode) {
        this(country, city, street, streetNo, zipCode);
        this.houseNr = houseNr;
    }

    public Adress(String country, String city, String street, int streetNo, String zipCode) {
        this(country, city, street, streetNo);
        this.zipCode = zipCode;
    }

    public Adress(String country, String city, String street, int streetNo) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNo = streetNo;
    }

    public Adress() {
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public Adress(int streetNo) {
        this.streetNo = streetNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(int houseNr) {
        this.houseNr = houseNr;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}