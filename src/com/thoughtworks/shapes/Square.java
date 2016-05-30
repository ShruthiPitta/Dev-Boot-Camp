package com.thoughtworks.shapes;

public class Square implements Shape {
    private final Dimension length;

    public Square(Dimension length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length.value()*length.value();
    }
}
