package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    double height = 175;

    @Test
    public void manWeight() {
        double expected = 86.25;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void womanWeight() {
        double expected = 74.75;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }


}

