package org.example.week6.midtermprep.task1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {

    private String restaurantName;
    private List<Customer> customers = new ArrayList<>();
    public Map<String, MenuItem> menuItems = new HashMap<>();


    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void addMenuItem(MenuItem item){
        menuItems.put(item.getCode(), item);

    }

    public Customer getCustomer(String CustomerId){
       for (Customer customer : customers){
           if (customer.getCustomerId().equals(CustomerId))
               return customer;
       }
       return null;
    }

    public void displayMenu(){
        for (MenuItem item:menuItems.values()){
            System.out.println(item.getDescription());
        }
    }

    public double calculateTotalSales(){
        double totalSales=0;
        for (Customer customer : customers){
            for (TableReservation<? extends MenuItem> reservation: customer.getReservationList() ){
                totalSales+=reservation.calculateTotalAmount();
            }
        }
        return totalSales;
    }


}
