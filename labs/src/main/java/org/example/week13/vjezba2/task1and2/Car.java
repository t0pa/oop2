package org.example.week13.vjezba2.task1and2;

public class Car {
    private final String engine;
    private final int wheels;
    private final boolean airConditioning;
    private final boolean sunroof;


    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.airConditioning = builder.airConditioning;
        this.sunroof = builder.sunroof;
    }


    // Static nested Builder class
    public static class CarBuilder {
        private final String engine;
        private final int wheels;
        private boolean airConditioning = false;
        private boolean sunroof = false;


        public CarBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder setAirConditioning(boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }
        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}

class myMain{
    public static void main(String[] args) {
        Car c1= new Car.CarBuilder("Mrnjao engin" , 5)
                .setAirConditioning(false)
                .setSunroof(true)
                .build();


        System.out.println(c1);

    }
}