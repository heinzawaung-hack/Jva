import com.sun.jdi.connect.TransportTimeoutException;

import java.util.concurrent.Callable;
class Car {
    private String model;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(String model,int cylinder) {
        this.model = model;
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String getModel() {
        return model;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine(){
        return "The car engine is starting.";
    }

    public String accelerate(){
        return "The accelerate is moving";
    }

    public String brakeSystem(){
        return "The break system is not working";
    }
}

class Lambo extends Car{

    public Lambo(String model, int cylinder) {
        super(model, cylinder);
    }

    @Override
    public String startEngine() {
        return "Lambo Engine is now starting";
    }

    @Override
    public String accelerate() {
        return "This acceleration is Fucking High..This is Lambo";
    }

    @Override
    public String brakeSystem() {
        return "Lambo Break System";
    }
}


class Main{
    public static void main(String[] args) {

        Car defaultCar = new Car("Default ,",8);
        System.out.println(defaultCar.getModel() + defaultCar.accelerate());

        Lambo myLambo = new Lambo("Aventador",12);
        System.out.println(myLambo.startEngine());

        Tesla myTesla = new Tesla("Tesla",10);
        System.out.println(myTesla.startEngine());
        System.out.println(myTesla.accelerate());

        Ferrari ferrariOne = new Ferrari("SF90",10);
        System.out.println(ferrariOne.getModel() + " and " + ferrariOne.brakeSystem());

    }
}