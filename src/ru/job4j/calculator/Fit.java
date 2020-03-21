package ru.job4j.calculator;

public class Fit {
    public static double manWeight (double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight (double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main (String[] args) {
        double height = (182); // ДАНО

        double man = Fit.manWeight(height);
        System.out.println (height + " centimeter man weighs " + man + " kg." );

        double woman = Fit.womanWeight(height);
        System.out.println (height + " centimeter woman weighs " + woman + " kg." );
    }
}
