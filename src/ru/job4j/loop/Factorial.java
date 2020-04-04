package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int factorial = 1; factorial <= n; factorial++) {
            result *= factorial;
        }
        if (result == 0) {
            result = 1;
        }
        return result;
    }
}