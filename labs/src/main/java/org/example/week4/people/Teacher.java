package org.example.week4.people;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String street, int salary){
        super(name, street);
        this.salary = salary;
    }


    public String toString(){
        return getName() + "\n" + getStreet() + "\n" + "salray " + salary +" euros/month";
    }
}
