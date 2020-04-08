package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas7Then5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 5, 6, 7};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = 5;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas8Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 5, 6, 7};
        int value = 8;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}