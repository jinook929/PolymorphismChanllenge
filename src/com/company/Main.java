package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed = 0;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public int accelerate(int speedAdded) {
        this.speed += speedAdded;
        System.out.println("Current speed = " + this.speed);
        return this.speed;
    }

    public int brake() {
        this.speed = 0;
        System.out.println("Car speed = " + this.speed);
        return this.speed;
    }
}

class Fit extends Car {
    public Fit() {
        super("Fit", 3);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int brake() {
        System.out.println("Fit stopped");
        return super.brake();
    }

}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Camry", 5);
        System.out.println(car.getName());
        Car fit = new Fit();
        System.out.println("Name of Car : " + fit.getName());
        fit.brake();
    }
}
