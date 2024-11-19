package org.example.week6.midtermprep.task1;

public class Drink extends MenuItem{

    private double volume;

    public Drink(String code, String name, double volume){
        this.setCode(code);
        this.setName(name);
        this.volume=volume;
    }
    @Override
    public String getDescription(){
        return "This is volume: " + volume;

    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }



}
