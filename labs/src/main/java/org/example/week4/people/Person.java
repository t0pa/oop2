package org.example.week4.people;

public class Person {

    private String name;
    private String street;
    private int age;
    private  String country;

    public Person(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country=country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String toString() {
        return name + "\n " + street;
    }
}
