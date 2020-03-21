package ru.job4j.condition;

public class Point {
    /*  Это первая попытка вычислений.
// a = V(x2 - x1)2* + (y2 - y1)2* - формула для наглядности

        public static double pow (double a, double b) { // возведение числа a в степень b
            return Math.pow(a, b);
        }

        public static double distance (double a) { // корень из a
            return Math.sqrt(a);
        }

        public static double distanceX (double x1, double x2) {
            return x2 - x1;
        }

        public static double distanceY (double y1, double y2) {
            return y2 - y1;
        }

    public static void main (String[] args) {

        double X1 = 0; //Первая точка X
        double Y1 = 1; //Первая точка Y
        double X2 = 2; //Вторая точка X
        double Y2 = -2; //Вторая точка Y

        double XX = distanceX(X1, X2); // первое действие
        double YY = distanceY(Y1, Y2); // второе действие
        double x2 = pow(XX, 2); // третье действие - возведение первого действия в степень
        double y2 = pow(YY, 2); // четвертое действие - возведение второго действия в степень
        double XY = x2 + y2; // пятое действие - сложение третьего и четвертого действия

        double result = distance (XY); // шестое действие - корень из пятого действия
        System.out.println ("The distance between (" + X1 + ", " + Y1 + ") and " + "(" + X2 + ", " + Y2 + ") is " + result + ".");

    */
    public static double distance (int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return rsl;
    }
    public static void main (String[] args) {
        // ДАНО
        int X1 = 0; //Первая точка X
        int Y1 = 0; //Первая точка Y
        int X2 = 2; //Вторая точка X
        int Y2 = 0; //Вторая точка Y

        double result = Point.distance(X1, Y1, X2, Y2);
        System.out.println ("The distance between (" + X1 + ", " + Y1 + ") and " + "(" + X2 + ", " + Y2 + ") is " + result + ".");
    }
}
