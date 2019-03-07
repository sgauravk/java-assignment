package com.step.assignments.inheritance;

public class Car extends Vehicle {
    private byte gears;
    private String gearType;
    private boolean ac;
    private String fuelType;

    public Car(String color, String name, int model, byte gears, String gearType, boolean ac, String fuelType) {
        super(color, "4-wheeler", name, model);
        this.gears = gears;
        this.gearType = gearType;
        this.ac = ac;
        this.fuelType = fuelType;
    }

    public void move(){
        System.out.println("moving");
    }

    public void stear(){
        System.out.println("hand-stearing");
    }

    public void changongGears(){
        System.out.println("changing-gears");
    }
}
