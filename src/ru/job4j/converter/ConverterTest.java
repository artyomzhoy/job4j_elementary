package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int ruble = 621;
        double out = Converter.rubleToEuro(ruble);
        double expected = 8.871428571428572;
        Assert.assertEquals(expected, out, 1e-8);
    }

    @Test
    public void rubleToDollar() {
        int ruble = 621;
        double out = Converter.rubleToDollar(ruble);
        double expected = 10.35;
        Assert.assertEquals(expected, out, 1e-8);
    }

    @Test
    public void euroToRuble() {
        int ruble = 621;
        double out = Converter.euroToRuble(Converter.rubleToEuro(ruble));
        double expected = 621;
        Assert.assertEquals(expected, out, 1e-8);
    }

    @Test
    public void dollarToRuble() {
        int ruble = 621;
        double out = Converter.dollarToRuble(Converter.rubleToDollar(ruble));
        double expected = 621;
        Assert.assertEquals(expected, out, 1e-8);
    }
}