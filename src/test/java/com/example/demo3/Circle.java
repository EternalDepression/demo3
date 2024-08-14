package com.example.demo3;

public abstract class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        setName("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}