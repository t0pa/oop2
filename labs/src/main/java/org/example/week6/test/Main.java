package org.example.week6.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static <T> List<T> reverse(List<T> lista){


        List<T> reversed = new ArrayList<>();

        for (int i =lista.size() ; 0<i-1; i--){
            reversed.add(lista.get(i));
        }

    return  reversed;
    }


    public static void main(String[] args) {

        ArrayList<Number> prva = new ArrayList<>();
        prva.add(2.8);
        prva.add(3.9);
        prva.add(7);


    }




}



class PromissoryNote{

    HashMap<String, Double> loans= new HashMap<>();

    public PromissoryNote(){

    }



    public void setLoan(String toWhom,double value){

        loans.put(toWhom,value);

    }

    public double howMuchIsTheDebt(String whose){
        return loans.getOrDefault(whose, 0.0);

    }



}

class Dictionary{



    HashMap<String,String> ef=new HashMap<>();

    public String translate(String word){

      return   ef.getOrDefault(word,"Word " + word +" is not in dictionary");

    }


    public void add(String word,String translation){
        ef.put(word,translation);

    }

    public int amountOfWords(){
        return ef.size();
    }


    public ArrayList<String> translationList(){

        ArrayList<String> translated = new ArrayList<>();

        for (String key : ef.keySet()){
            translated.add(key + " = " + ef.get(key));
        }


        return translated;

    }
   
}

class TextUserInterface{

    Scanner reader;
    Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){

        this.reader=reader;
        this.dictionary=dictionary;

    }


    public void start(){

        while (true){


            System.out.println(
                    "Statement : "
            );
            String read= reader.nextLine();

            if (read.equals("quit")){
                System.out.println("Cheers");
                break;
            }

            if (read.equals("add")){

                String key;
                String value;

                System.out.println("Enter word");
                key= reader.nextLine();
                System.out.println("Enter translation");
                value=reader.nextLine();


                dictionary.add(key,value);
                continue;
            }


            if(read.equals("translate")){

                System.out.println("Enter your word");
                String word=reader.nextLine();

                System.out.println(dictionary.translate(word));
                continue;

            }

             else {
                System.out.println("Unknown Statement");
            }







        }


    }


}