package org.example.week6.midtermprep.task2;

public class Motorcycle extends Vehicle{


    private double engineCapacity;

    public Motorcycle(String vehicleId, String name, double rentalRate,double engineCapacity ){
        super(vehicleId,name, rentalRate);
        this.engineCapacity=engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity){
        this.engineCapacity=engineCapacity;
    }

    public double getEngineCapacity(){
        return this.engineCapacity;
    }


    @Override
    public String getDescription(){
        return "This is good motorcylle";
    }

}
