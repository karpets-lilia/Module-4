package car;

import java.util.ArrayList;

public class Car {
    private String modelName;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private int fuelLevel;

    Car(String modelName, Engine engine, ArrayList<Wheel> wheels, int fuelLevel) {
        this.modelName = modelName;
        this.engine = engine;
        this.wheels = wheels;
        this.fuelLevel = fuelLevel;
    }
    public String getModelName() {
        return modelName;
    }

    public void  drive() {
        if (wheels.size() == 4 && engine != null) {
            System.out.println("drive!");
        } else if (wheels.size() != 4 && engine != null) {
             System.out.println("check wheels!");
        } else if (wheels.size() == 4 && engine == null) {
             System.out.println("check engine!");
        } else {
             System.out.println("your car is crap!");
        }
    }

    public Boolean checkFuelLevel() {
        Boolean isFuelEnough;
        if(fuelLevel < 10) {
            System.out.println("refuel the car!");
            isFuelEnough = false;
        } else {
            System.out.println("enough fuel.");
            isFuelEnough = true;
        }
        return isFuelEnough;
    }

    public void changeWheels(ArrayList<Wheel> newWheels) {
        wheels = newWheels;
        System.out.println("Wheels were changed");
    }
    public void addFuel(int addedFuelLevel) {
        fuelLevel = fuelLevel + addedFuelLevel;
        System.out.println("Now you have " + fuelLevel + " litres");
    }
}


