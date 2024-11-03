package org.example.week5;

public class Truck extends Vehicle implements Repairable{

    private int minusLifespan=0;

    public Truck(String modelName) {
        super(modelName);
    }

    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    public String repair(){
        return "Engine overhauled and tires replaced for " + getModelName();
    }

    @Override
    public String service() {
        return "Servicing Truck: " + getModelName() + "\nMileage: " + getMileage() + "\nHealth: " + getHealth() + "\nService procedure: Checking engine, changing oil, check Truck tire pressure.";
    }

    public int expectedLifespan(){
        return 300000 - minusLifespan;
    }


    public void haul(int loadWeight){
        if (loadWeight > 5000){
            setHealth(getHealth() - 10 );
        }
        if (getHealth()<30){
            minusLifespan+=20000;
        }
    }




}
