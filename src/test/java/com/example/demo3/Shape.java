package com.example.demo3;

public abstract class Shape {
    private String name;

    abstract int getArea();

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
