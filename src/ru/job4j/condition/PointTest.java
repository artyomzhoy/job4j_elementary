package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 0; //Первая точка X
        int y1 = 0; //Первая точка Y
        int x2 = 2; //Вторая точка X
        int y2 = 0; //Вторая точка Y
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 1e-8);
    }
}
