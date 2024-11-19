package org.example.week6.midtermprep.task2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class Vehicle implements Rentable {

    private String vehicleId;
    private String name;
    private double rentalRate;
    private HashMap<Date, Integer> kilometersRecord;

    public Vehicle(String vehicleId, String name, double rentalRate) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.rentalRate = rentalRate;
        this.kilometersRecord=new HashMap<>();
    }

    public void addKilometers(Date rentalDate, int kilometers){
        kilometersRecord.put(rentalDate,kilometers);
    }

    public int getTotalKilometers(){
        int total=0;
        for (Integer i : kilometersRecord.values()){
            total+=i;
        }
        return total;
    }


    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Override
    public double applyDiscount(double discountRate) {
        return rentalRate - (discountRate*rentalRate);
    }


    @Override
    public String getDescription() {
        return "This is Vehicle description" +vehicleId+name+rentalRate;
    }
}
