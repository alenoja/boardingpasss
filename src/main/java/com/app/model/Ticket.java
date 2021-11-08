package com.app.model;


import javax.persistence.*;

//Ticket Entity
@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "ticket") //This is for the actual name of the database table we are mapping to the class.
public class Ticket {
    //Define fields
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "ticket_id") //This is mapping the primary key to the ticket_id column in the table.
    private int ticket_id;

    @Column(name = "customer_id") //This will map the customerId  field to the column named customer_id in the table.
    private int customer_id;

    @Column(name = "price_id") //This will map the priceId field to the column named price_id in the table.
    private int priceId;

    @Column(name = "travel_date") //This will map the travelDate field to the column named travel_date in the table.
    private String travelDate;

    @Column(name = "origin") //This will map the origin field to the column named origin in the table.
    private String origin;

    @Column(name = "destination") //This will map the destination field to the column named destination in the table.
    private String destination;

    @Column(name = "departure_time") //This is mapping the departureTime field to the column named departure_time in the table.
    private String departureTime;

    @Column(name = "eta") //This will map the eta field to the column named eta in the table.
    private String eta;

    @Column(name = "first_name") //This will map the firstName field to the column named first_name in the table.
    private String firstName;

    @Column(name = "last_name") //This will map the lastName field to the column named last_name in the table.
    private String lastName;

    @Column(name = "email") //This will map the email field to the column named email in the table.
    private String email;

    @Column(name = "phone") //This is mapping the phone field to the column named phone in the table.
    private String phone;

    @Column(name = "gender") //This will map the gender field to the column named gender in the table.
    private String gender;

    @Column(name = "age") //This is mapping the age field to the column named age in the table.
    private int age;

    @Column(name = "purchase_date") //This is mapping the purchaseDate field to the column named purchase_date in the table.
    private int purchaseDate;

    @Column(name = "quantity") //This is mapping the quantity field to the column named quantity in the table.
    private int quantity;

    @Column(name = "price") //This is mapping the price field to the column named price in the table.
    private int price;

    @Column(name = "final_price") //This is mapping the finalPrice field to the column named final_price in the table.
    private int final_price;

    //default constructor
    public Ticket(){
    }

    public Ticket(int ticket_id, int customer_id, int priceId, String travelDate, String origin, String destination, String departureTime, String eta, String firstName, String lastName) {
        this.ticket_id = ticket_id;
        this.customer_id = customer_id;
        this.priceId = priceId;
        this.travelDate = travelDate;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.eta = eta;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getter/setters


    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFinal_price() {
        return final_price;
    }

    public void setFinal_price(int final_price) {
        this.final_price = final_price;
    }

    //ToString Method

    @Override
    public String toString() {
        return "Ticket{" +
                "ticket_id=" + ticket_id +
                ", customer_id=" + customer_id +
                ", priceId=" + priceId +
                ", travelDate='" + travelDate + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", eta=" + eta +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", purchaseDate=" + purchaseDate +
                ", quantity=" + quantity +
                ", price=" + price +
                ", final_price=" + final_price +
                '}';
    }
}