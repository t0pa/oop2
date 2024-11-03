package org.example.week5;

public class Motorcycle extends Vehicle {

    private int minusLifespan=0;

    public Motorcycle(String modelName) {
        super(modelName);
    }

    public Motorcycle(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }


    @Override
    public String service() {
        return "Servicing Motorcycle: " + getModelName() + "\nMileage: " + getMileage() + "\nHealth: " + getHealth() + "\nService procedure: Checking engine, changing oil, check brake.";
    }

    public int expectedLifespan(){
        return 50000 - minusLifespan;
    }


    public void race(int raceMiles){
        setMileage(getMileage() + raceMiles);
        setHealth(getHealth() - 15);
        if (getHealth()<40){
            minusLifespan+=5000;
        }
    }

}
