package org.example.week13.vjezba2.task1and2;

public class PayPalPayment implements Payment
{
    private String email="Email";

    @Override
    public void processPayment(){
        System.out.println("processig paypalpayment");
    };




}
