package com.example.demo3;

public abstract class Rectangle extends Shape {
    private final int length;
    private final int width;

    Rectangle(int length, int width) {
        setName("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}