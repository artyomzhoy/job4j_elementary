package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    int p = 150; // периметр
    int k = 2; // во сколько раз длина больше высоты

    @Test
    public void square() {
        double expected = 1250;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 1e-8);
    }
}
