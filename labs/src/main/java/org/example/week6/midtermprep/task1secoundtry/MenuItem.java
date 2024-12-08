package org.example.week6.midtermprep.task1secoundtry;


import java.awt.*;
import java.util.*;
import java.util.List;

enum CusisneType {
    ITALIAN,
    CHINESE,
    MEXICAN,
    INDIAN,
    FRENCH
}


 interface Billable {

    double applyDiscount(double discountRate);
    String getDescription();

}

abstract class MenuItem implements Billable {

    String code;
    String name;
    double price;

    public MenuItem(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double applyDiscount(double discountRate){
        return price - (price*discountRate);
    }

    @Override
    public String getDescription(){
        return "description of menuItem";
    }

}


class Dish extends MenuItem{

    private CusisneType cusisneType;
    private String mainIngredient;

    public Dish(String code, String name, double price, CusisneType cusisneType, String mainIngredient) {
        super(code, name, price);
        this.cusisneType = cusisneType;
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String getDescription(){
        return "This is dish";
    }


    public CusisneType getCusisneType() {
        return cusisneType;
    }

    public void setCusisneType(CusisneType cusisneType) {
        this.cusisneType = cusisneType;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
}


class Dring extends MenuItem{

    private double volume;

    public Dring(String code, String name, double price, double volume) {
        super(code, name, price);
        this.volume = volume;
    }

    @Override
    public String getDescription(){

        return "this is drink";

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

class TableReservation <T extends MenuItem & Billable>{

    String reservationId;
    Date reservationDate;
    HashMap<T,Integer> orderedItems;
    int tableNumber;

    public TableReservation(String reservationId, Date reservationDate, int tableNumber) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.tableNumber = tableNumber;
        this.orderedItems = new HashMap<>();
    }

    public void addItemToOrder(T item,int quantity){
        orderedItems.put(item,quantity);
    }

    public double calculateTotalAmount(){
        double total=0;
        for (Map.Entry<T,Integer> item : orderedItems.entrySet()){
            total+=item.getValue()*item.getKey().applyDiscount(0.5);
        }
        return total;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public HashMap<T, Integer> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(HashMap<T, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
}


class Customer{

   private String customerId;
    private String name;
    private String phoneNumber;
    private List<TableReservation<? extends MenuItem>> reservations;

    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.reservations= new ArrayList<>();
    }

    public void addReservation(TableReservation<? extends MenuItem> reservation){
        reservations.add(reservation);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<TableReservation<? extends MenuItem>> getReservations() {
        return reservations;
    }

    public void setReservations(List<TableReservation<? extends MenuItem>> reservations) {
        this.reservations = reservations;
    }
}


class Restaurant{
    private String restaurantName;
    private List<Customer> customers;
    private Map<String,MenuItem> menuItems;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
        this.customers=new ArrayList<>();
        this.menuItems=new HashMap<>();

    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void addMenuItem(MenuItem item){
        menuItems.put(item.code, item);
    }


    public Customer getCustomer(String customerId){

        for (Customer customer: customers){
            if (customerId.equals(customer.getCustomerId())){
                return customer;
            }
        }
        return null;
    }

    public void displayMenu(){
        for (Map.Entry<String,MenuItem> items : menuItems.entrySet()){
            System.out.println(items.getValue().name+" " +items.getValue().getDescription());


        }
    }


    public double calculateTotalSales(){
        double total=0;
        for (Customer customer: customers){
            for (TableReservation<? extends MenuItem> reservation : customer.getReservations()){
                total+=reservation.calculateTotalAmount();
            }
        }
        return total;

    }




}