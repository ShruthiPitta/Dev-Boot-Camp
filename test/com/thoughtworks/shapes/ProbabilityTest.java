package com.thoughtworks.shapes;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProbabilityTest {

    @Test
    public void testNegation() {
        Probability pc = new Probability(0.2);
        assertThat(pc.negate().equals(new Probability(0.8)), is(true));
    }


    @Test
    public void testEqualsReflexive() {
        Probability p = new Probability(0.2);
        Assert.assertTrue(p.equals(p));
    }


    @Test
    public void testEqualsSymmetry() {
        Probability p1 = new Probability(0.2);
        Probability p2 = new Probability(0.2);
        Assert.assertEquals(p1.equals(p2), p2.equals(p1));
    }

    @Test
    public void testEqualsTransitive() {
        Probability p1 = new Probability(0.2);
        Probability p2 = new Probability(0.2);
        Probability p3 = new Probability(0.2);
        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p3));
        Assert.assertTrue(p3.equals(p1));
    }

    @Test
    public void testNotEquals() {
        Probability p1 = new Probability(0.2);
        Probability p2 = new Probability(0.3);
        Assert.assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsForNull() {
        Probability p1 = new Probability(0.2);
        Assert.assertFalse(p1.equals(null));
    }


    @Test
    public void testAndProbability() {
        Probability p1 = new Probability(0.2);
        Probability p2 = new Probability(0.2);
        Assert.assertThat(p1.and(p2),is(new Probability(0.04)));
    }


    @Test
    public void testOrForTwoIndependentEvents(){
        Probability p1 = new Probability(0.2);
        Probability p2 = new Probability(0.2);
        Assert.assertThat(p1.or(p2),is(new Probability(0.36)));
    }

    @Test
    public void testOrForTwoIndependentEventsWithUpperBounds(){
        Probability p1 = new Probability(1.0);
        Probability p2 = new Probability(1.0);
        Assert.assertThat(p1.or(p2),is(new Probability(1.0)));
    }
    @Test
    public void testAndProbabilityForNull() {
        Probability p1 = new Probability(1);

        Assert.assertThat(p1.and(null), is(new Probability(0)));

    }

    @Test
    public void testOrProbabilityForNull() {
        Probability p1 = new Probability(1);

        Assert.assertThat(p1.or(null), is(p1));

    }
}
