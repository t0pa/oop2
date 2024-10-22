package org.example.week4.people;


public class Main {

    public static void main(String[] args) {

        Student one= new Student("Miralem","Alipasino",1);

        one.addGrade(10);
        one.addGrade(10);

        System.out.println(one);
    }
}
