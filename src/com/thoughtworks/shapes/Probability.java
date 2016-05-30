package com.thoughtworks.shapes;

public class Probability {

    private static final double MAX_PROBABILITY = 1.0;

    private double value;

    public Probability(double probability) {
        this.value = probability;
    }

    public Probability negate() {
        Probability negated = new Probability(MAX_PROBABILITY - this.value);
        return negated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        return Double.compare(that.value, value) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    public Probability and(Probability p2) {
        if(p2 ==null)
            return new Probability(0);

       return new Probability(value * p2.value);
    }
}
