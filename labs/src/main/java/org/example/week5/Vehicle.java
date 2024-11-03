package org.example.week5;

abstract class Vehicle {

    private String modelName;
    private int mileage;
    private int health;


    public Vehicle(String modelName){
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }

    public Vehicle(String modelName, int mileage, int health){
        this.modelName = modelName;
        this.mileage = mileage;
        setHealth(health);
    }


    public String getModelName() {
        return modelName;
    }

    public int getMileage() {
        return mileage;
    }

    public int getHealth() {
        return health;
    }

    abstract String service();

    abstract int expectedLifespan();



    public boolean needMaintenance(){
        return this.health < 70;
    };

    public int calculateRemainingLifespan() {
        int lifespan = expectedLifespan();
        if (health < 50) {
            lifespan -= (50 - health) * (lifespan / 100);
        }
        return lifespan - mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setHealth(int health) {
       if(health > 100 || health < 0){
           System.out.println("Invalid health");
       }
       else {
           this.health = health;
       }
    }

    public void simulateYear() {
        if (mileage > expectedLifespan() / 2) {
            health -= 5;
        }
        calculateRemainingLifespan();
    }

    public static void performMaintenance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.repair();
            car.drive(50); // Add mileage if needed, e.g., car.drive(50);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            truck.repair();
            truck.haul(1000); // Specify load weight, e.g., truck.haul(1000);
        } else if (vehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) vehicle;
            motorcycle.race(25); // Specify race distance, e.g., motorcycle.race(25);
        }
    }

}
