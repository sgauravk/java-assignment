package com.step.assignments.inheritance;

public class Bike extends Vehicle {
    private byte gears;
    private boolean selfStart;

    public Bike(String color, String name, int model, byte gears, boolean selfStart) {
        super(color, "2-wheeler", name, model);
        this.gears = gears;
        this.selfStart = selfStart;
    }

    public void move(){
        System.out.println("moving");
    }

    public void accelarate(){
        System.out.println("accelararated");
    }

    public void deaccelarate(){
        System.out.println("deaccelarated");
    }
}
