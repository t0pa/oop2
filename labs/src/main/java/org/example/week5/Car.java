package org.example.week5;

public class Car extends Vehicle implements Repairable {

    private int minusLifespan=0;

    public Car(String modelName) {
        super(modelName);
    }

    public Car(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }


    public String repair(){
        return "Engine tuned and oil changed for " + getModelName();
    }

    @Override
    public String service() {
        return "Servicing Car: " + getModelName() + "\nMileage: " + getMileage() + "\nHealth: " + getHealth() + "\nService procedure: Checking engine, changing oil.";
    }

    public int expectedLifespan(){
        return 150000 - minusLifespan;
    }

    public void drive(int miles){
        setMileage(getMileage() + miles);
        setHealth(getHealth() - 2);
        if (getHealth()<30){
            minusLifespan+=1000;
        }
    }

}
