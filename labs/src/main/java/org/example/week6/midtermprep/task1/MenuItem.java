package org.example.week6.midtermprep.task1;

public  abstract class MenuItem implements Billable {

    private String code;
    private String name;
    private double price;


    @Override
    public double applyDiscount(double discountRate) {
        return price - (discountRate*price);
    }

    @Override
    public String getDescription() {
        return code+" "+name+" " +price;
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
}
