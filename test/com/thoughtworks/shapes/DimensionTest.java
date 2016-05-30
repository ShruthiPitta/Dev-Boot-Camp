package com.thoughtworks.shapes;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class DimensionTest {

    @Test
    public void testForValidDimension(){
        assertNotNull( new Dimension(4));

    }
    @Test(expected = RuntimeException.class )
    public void testForInValidDimension(){
        new Dimension(-6);
    }
}