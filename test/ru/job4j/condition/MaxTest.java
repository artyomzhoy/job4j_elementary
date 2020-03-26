package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMaxLeftThenLeft() {
        int left = 3;
        int right = 0;
        int result = Max.max(left, right);
        assertThat(result, is(left));
    }
    @Test
    public void whenMaxRightThenRight() {
        int left = -3;
        int right = 100;
        int result = Max.max(left, right);
        assertThat(result, is(right));
    }
    @Test
    public void whenMaxLeftAndRightThenAny() {
        int left = 100;
        int right = 100;
        int result = Max.max(left, right);
        assertThat(result, is(right));
    }
}