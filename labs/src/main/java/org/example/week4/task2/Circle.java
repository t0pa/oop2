package org.example.week4.task2;

public class Circle extends Shape {
    public double radius;

    public Circle (String color,FillType filled,double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }

    public double calculateCircumference(double PI, double r){
        return 2*PI*r;
    }

    public double calculateCircumference(double r){
        double PI = 3.14;
        return 2*PI*r;
    }


    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(radius);
        System.out.println(getArea());
    }


}
