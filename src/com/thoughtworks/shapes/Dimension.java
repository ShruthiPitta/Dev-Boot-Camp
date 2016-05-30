package com.thoughtworks.shapes;

public class Dimension {
    public double value() {
        return value;
    }

    private final double value;

    public Dimension(double value) {
        validate(value);
        this.value = value;
    }

    private boolean validate(double value){
        if(value<0)
            throw new RuntimeException("Invalid Value");
        return true;
    }
}
