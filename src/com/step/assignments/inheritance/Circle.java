package com.step.assignments.inheritance;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if(radius < 0) this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double radiusSquare = this.radius * this.radius;
        return Math.PI * radiusSquare;
    }
}
