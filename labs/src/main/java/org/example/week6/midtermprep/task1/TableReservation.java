package org.example.week6.midtermprep.task1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TableReservation <T extends MenuItem & Billable>  {

    private String reservationId;
    private Date reservationDate;
    private HashMap<T,Integer> orderedItems;
    private int tableNumber;

    public TableReservation(String reservationId, Date reservationDate, int tableNumber){
        this.reservationDate=reservationDate;
        this.reservationId=reservationId;
        this.tableNumber=tableNumber;
        this.orderedItems=new HashMap<>();
    }

    public void addItemToOrder(T item, int quantity){
        orderedItems.put(item,quantity);
    }

    public double calculateTotalAmount(){
        double totalPrice=0;

        for (Map.Entry<T, Integer> item:orderedItems.entrySet()){

            int quantity=item.getValue();
            double discount=item.getKey().applyDiscount(0.5);
            totalPrice+=discount*quantity;
        }

        return totalPrice;
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
