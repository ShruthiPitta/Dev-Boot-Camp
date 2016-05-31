package com.thoughtworks.shapes;

public class Probability {

    private static final double MAX_PROBABILITY = 1.0;

    private double chance;

    public Probability(double probability) {
        this.chance = probability;
    }

    public Probability negate() {
        Probability negated = new Probability(MAX_PROBABILITY - this.chance);
        return negated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        return Double.compare(that.chance, chance) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(chance);
        return (int) (temp ^ (temp >>> 32));
    }

    public Probability and(Probability that) {
        if (that == null)
            return new Probability(0);

        double andValue = this.chance * that.chance;
        return new Probability(round(andValue));
    }

    private double round(double value) {
        return Math.round(value * 10000) / 10000.0;
    }

    public Probability or(Probability that) {
        if (that == null)
            return this;
        double orValue = (this.chance + that.chance) - this.and(that).chance;
        return new Probability(round(orValue));
    }
}
