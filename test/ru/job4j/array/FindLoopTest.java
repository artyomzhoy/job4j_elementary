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
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenNotFind() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 5;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}