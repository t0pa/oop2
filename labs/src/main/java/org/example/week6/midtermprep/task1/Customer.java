package org.example.week6.midtermprep.task1;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerId;
    private  String name;
    private String phoneNumber;
    List<TableReservation<? extends MenuItem>> reservationList;


    public Customer(String customerId, String phoneNumber, String name) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        reservationList= new ArrayList<>();
    }

    public void addReservation(TableReservation<? extends MenuItem> reservation){
        reservationList.add(reservation);
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

    public List<TableReservation<? extends MenuItem>> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<TableReservation<? extends MenuItem>> reservationList) {
        this.reservationList = reservationList;
    }
}
