package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void when4Max() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        int first = 7;
        int second = -1;
        int third = 4;
        MultiMax check = new MultiMax();
        int result = check.max(first, second, third);
        assertThat(result, is(first));
    }
    @Test
    public void whenSecondMax() {
        int first = -7;
        int second = -1;
        int third = -4;
        MultiMax check = new MultiMax();
        int result = check.max(first, second, third);
        assertThat(result, is(second));
    }
    @Test
    public void whenThirdMax() {
        int first = -143;
        int second = 0;
        int third = 143;
        MultiMax check = new MultiMax();
        int result = check.max(first, second, third);
        assertThat(result, is(third));
    }
    @Test
    public void whenAllMax() {
        int first = 114;
        int second = 114;
        int third = 114;
        MultiMax check = new MultiMax();
        int result = check.max(first, second, third);
        assertThat(result, is(third));
    }
}