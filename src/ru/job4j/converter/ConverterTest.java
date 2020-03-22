package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    int ruble = 621;

    @Test
    public void rubleToEuro() {
        double out = Converter.rubleToEuro(ruble);
        double expected = 8.871428571428572;
        Assert.assertEquals(expected, out, 1e-8);
    }

    @Test
    public void rubleToDollar() {
        double out = Converter.rubleToDollar(ruble);
        double expected = 10.35;
        Assert.assertEquals(expected, out, 1e-8);
    }

    @Test
    public void euroToRuble() {
        double out = Converter.euroToRuble(Converter.rubleToEuro(ruble));
        double expected = 621;
        Assert.assertEquals(expected, out, 1e-8);
    }

    @Test
    public void dollarToRuble() {
        double out = Converter.dollarToRuble(Converter.rubleToDollar(ruble));
        double expected = 621;
        Assert.assertEquals(expected, out, 1e-8);
    }
}