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

    public String startEngine() {
        return "Engine started";
    }

    public String accelerate() {
        return "Car accelerated";
    }

    public String brake() {
        return "Car stopped";
    }
}

class Fit extends Car {
    public Fit() {
        super("Fit", 3);
    }

    @Override
    public String startEngine() {
        return "Fit engine started";
    }

    @Override
    public String accelerate() {
        return "Fit accelerated";
    }

    @Override
    public String brake() {
        return "Fit stopped";
    }    
}

class Corolla extends Car {
    public Corolla() {
        super("Corolla", 3);
    }

    @Override
    public String startEngine() {
        return "Corolla engine started";
    }

    @Override
    public String accelerate() {
        return "Corolla accelerated";
    }

    @Override
    public String brake() {
        return "Corolla stopped";
    }
}

class Camry extends Car {
    public Camry() {
        super("Camry", 3);
    }

    @Override
    public String startEngine() {
        return "Camry engine started";
    }

    @Override
    public String accelerate() {
        return "Camry accelerated";
    }

    @Override
    public String brake() {
        return "Camry stopped";
    }
}

class Rav4 extends Car {
    public Rav4() {
        super("Rav4", 3);
    }

    @Override
    public String startEngine() {
        return "Rav4 engine started";
    }

    @Override
    public String accelerate() {
        return "Rav4 accelerated";
    }

    @Override
    public String brake() {
        return "Rav4 stopped";
    }
}

class Highlander extends Car {
    public Highlander() {
        super("Highlander", 3);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " Accelerated";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " Stopped";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car", 2);
        System.out.println(car.getName());
        
        Fit fit = new Fit();
        System.out.println("Name of Car : " + fit.getName());
        System.out.println(fit.startEngine());
        System.out.println(fit.accelerate());
        System.out.println(fit.brake());

        Corolla corolla = new Corolla();
        System.out.println("Name of Car : " + corolla.getName());
        System.out.println(corolla.startEngine());
        System.out.println(corolla.accelerate());
        System.out.println(corolla.brake());

        Camry camry = new Camry();
        System.out.println("Name of Car : " + camry.getName());
        System.out.println(camry.startEngine());
        System.out.println(camry.accelerate());
        System.out.println(camry.brake());

        Rav4 rav4 = new Rav4();
        System.out.println("Name of Car : " + rav4.getName());
        System.out.println(rav4.startEngine());
        System.out.println(rav4.accelerate());
        System.out.println(rav4.brake());

        Highlander highlander = new Highlander();
        System.out.println("Name of Car : " + highlander.getName());
        System.out.println(highlander.startEngine());
        System.out.println(highlander.accelerate());
        System.out.println(highlander.brake());
    }
}
