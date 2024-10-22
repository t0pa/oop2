package org.example.week4.task2;

public class Rectangle extends Shape{

    double width;
    double heigh;

    public Rectangle(String color, FillType filled, double width, double heigh){
        super(color, filled);
        this.width=width;
        this.heigh=heigh;
    }

    public double getArea(){
        return width*heigh;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width : " + width + "Heght" + heigh);
        System.out.println(getArea());

    }
}
