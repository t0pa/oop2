package org.example.week13.vjezba2.task1and2;

public class PaymentFactory  {


    public Payment createPayment(String type){

        if (type =="Credit"){
            return new CreditCardPayment();
        }

        if (type=="pay"){
            return new PayPalPayment();
        }

        return null;
    }

}


class temp{
    public static void main(String[] args) {
        PaymentFactory p1 = new PaymentFactory();


    }
}