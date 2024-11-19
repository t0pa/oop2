package org.example.week6.midtermprep.task2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RentalTransaction <T extends Vehicle & Rentable> {

    private String transactionId;
    private Date rentalDate;
    private HashMap<T,Integer> rentedVehicles;
    private int customerId;

    public RentalTransaction(String transactionId, Date rentalDate, int customerId) {
        this.transactionId = transactionId;
        this.rentalDate = rentalDate;
        this.customerId = customerId;
        this.rentedVehicles=new HashMap<>();
    }


    public void addVehicleToRental(T vehicle, int days){
        rentedVehicles.put(vehicle,days);
    }

    public double calculateTotalAmount(){
        double total=0;
        for (Map.Entry<T,Integer> item : rentedVehicles.entrySet()){

            total+=item.getValue()*item.getKey().applyDiscount(0.0);
        }
        return total;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public HashMap<T, Integer> getRentedVehicles() {
        return rentedVehicles;
    }

    public void setRentedVehicles(HashMap<T, Integer> rentedVehicles) {
        this.rentedVehicles = rentedVehicles;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
