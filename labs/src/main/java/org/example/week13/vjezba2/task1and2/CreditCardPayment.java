package org.example.week13.vjezba2.task1and2;

public class CreditCardPayment implements Payment{
    private String creditCrardNum="123-123-*123-123";

    @Override
    public void processPayment() {
        System.out.println("Proccessing creditCardpaymetn");
    }
}
