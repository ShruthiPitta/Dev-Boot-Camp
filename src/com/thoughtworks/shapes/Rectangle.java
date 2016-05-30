package com.thoughtworks.shapes;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    public double computeArea(){
        return length*breadth;
    }
}
