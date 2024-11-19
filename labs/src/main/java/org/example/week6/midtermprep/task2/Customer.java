package org.example.week6.midtermprep.task2;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerId;
    private String name;
    private String phoneNumber;
    private List<RentalTransaction<? extends Vehicle>> rentalHistory;


    public Customer(String customerId, String phoneNumber, String name) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.rentalHistory=new ArrayList<>();
    }


    public void addRentalTransactions(RentalTransaction<? extends Vehicle> transaction){
        rentalHistory.add(transaction);
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

    public List<RentalTransaction<? extends Vehicle>> getRentalHistory() {
        return rentalHistory;
    }

    public void setRentalHistory(List<RentalTransaction<? extends Vehicle>> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }
}
