package org.example.week4.task2;

public class Shape {

    private String color;
    private FillType filled;

    public Shape(String color, FillType filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FillType getFilled() {
        return filled;
    }

    public void setFilled(FillType filled) {
        this.filled = filled;
    }

    public void displayInfo(){
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);

    }

}
