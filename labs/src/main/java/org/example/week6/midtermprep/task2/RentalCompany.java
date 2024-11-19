package org.example.week6.midtermprep.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalCompany {

    private  String companyName;
    private List<Customer> customers;
    private Map<String,Vehicle> vehicleInventory;

    public RentalCompany(String companyName) {
        this.companyName = companyName;
        this.customers=new ArrayList<>();
        this.vehicleInventory= new HashMap<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void addVehicle(Vehicle vehicle){
        vehicleInventory.put(vehicle.getVehicleId(),vehicle);
    }

    public Customer getCustomer(String customerId){
        for (Customer nesta: customers){
            if (nesta.getCustomerId().equals(customerId)){
                return nesta;
            }
        }
        return null;
    }

    public void displayInventory(){
        for (Map.Entry<String,Vehicle> item : vehicleInventory.entrySet()){

            System.out.println(item.getValue().getName()+" "+item.getValue().getDescription());

        }

    }


    public double calculateTotalRevenue(){

        double total=0;

        for (Customer customer : customers){

            for (RentalTransaction<? extends Vehicle> rentals : customer.getRentalHistory()){
                total+=rentals.calculateTotalAmount();
            }

        }
        return total;

    }





}
