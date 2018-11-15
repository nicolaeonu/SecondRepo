package com.nicolae;


class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car >> startEngine()";
    }
    public String accelerate(){
        return "Car >> accelerate()";
    }
    public String brake(){
        return "Car >> brake()";
    }

}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi >> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi >> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi >> brake()";
    }
}
class Mercedes extends Car {

    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mercedes >> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mercedes >> accelerate()";
    }

    @Override
    public String brake() {
        return "Mercedes >> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford >> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford >> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford >> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "clasic car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println(" ");

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println(" ");

        Ford ford = new Ford(6, "ford mondeo");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println(" ");

        Mercedes mercedes = new Mercedes(6, "S500 Couple");
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());
        System.out.println(mercedes.getName());
    }
}


