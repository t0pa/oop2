package org.example.week5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Sedan", 30000, 85);
        Truck truck = new Truck("Freightliner", 50000, 90);
        Motorcycle motorcycle = new Motorcycle("Sportbike", 15000, 95);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorcycle);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.service());
            vehicle.simulateYear();

            if (vehicle instanceof Car) {
                Car carVehicle = (Car) vehicle;
                carVehicle.drive(120);
                System.out.println("Drove car: " + carVehicle.getModelName());
            } else if (vehicle instanceof Truck) {
                Truck truckVehicle = (Truck) vehicle;
                truckVehicle.haul(7000);
                System.out.println("Hauled with truck: " + truckVehicle.getModelName());
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycleVehicle = (Motorcycle) vehicle;
                motorcycleVehicle.race(30);
                System.out.println("Raced motorcycle: " + motorcycleVehicle.getModelName());
            }
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println("Performing maintenance on " + vehicle.getModelName() + ":");
            Vehicle.performMaintenance(vehicle);
        }
    }
}

