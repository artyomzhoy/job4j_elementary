package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void when5Numbers() {
        int[] input = new int[] {11, 0, -5, 33, 28};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-5, 0, 11, 28, 33};
        assertThat(result, is(expect));
    }
    @Test
    public void when3Numbers() {
        int[] input = new int[] {98, 143, -1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-1, 98, 143};
        assertThat(result, is(expect));
    }
}