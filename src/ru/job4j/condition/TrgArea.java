package ru.job4j.condition;

/*
S = V p(p - a)(p - b)(p - c)
P = (a + b + c) / 2
 */

public class TrgArea {
    /*public static double halfPerimeter (double a, double b, double c) {
        double rsl = (a + b + c) / 2;
        return rsl;
    }
    public static double A (double a, double b, double c) {
        return P(a, b, c) - a;
    }
    public static double B (double a, double b, double c) {
        return P(a, b, c) - b;
    }
    public static double C (double a, double b, double c) {
        return P(a, b, c) - c;
    }
    public static double V (double a, double b, double c) {
        return P(a, b, c)*A(a, b, c)*B(a, b, c)*C(a, b, c);
    }
    public static double area (double a, double b, double c) {
        return Math.sqrt(V(a, b, c));
    }
    public static double area (double a, double b, double c) {
        double rsl = Math.sqrt((halfPerimeter(a, b, c))*(((halfPerimeter(a, b, c)-a)*(((halfPerimeter(a, b, c)-b)*(((halfPerimeter(a, b, c)-c));
        return rsl;
    }*/
    public static double area(double a, double b, double c) {
        double rsl = Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
        return rsl;
    }

    public static void main(String[] args) {
        // ДАНО
        double a = 2;
        double b = 2;
        double c = 2;

        double rsl = TrgArea.area(a, b, c);
        System.out.println("Area (" + a + ", " + b + ", " + c + ") = " + rsl + ".");
    }
}
