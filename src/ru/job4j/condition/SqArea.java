package ru.job4j.condition;

public class SqArea {
/* Формулы для наглядности
   p = 2 * (L + h);
   L = h * k;

   p - периметр
   s - площадь
   L - длина
   H - высота
   k - во сколько раз длина больше высоты

   H = p / (2 * (k + 1));
   L = H * k;
   s = L * H;

    Это первая попытка вычислений.

    public static double height (double p, double k) {
        double rsl = p / (2*(k+1));
        return rsl;
    }

    public static double length (double p, double k) {
        double rsl = height(p, k) * k;
        return rsl;
    }

    public static double square (double p, double k) {
        double rsl = height(p, k) * length(p, k);
        return  rsl;
    }
*/

    public static double square(int p, int k) {
        double rsl = (p / (2 * (k + 1))) * ((p / (2 * (k + 1))) * k);
        return rsl;
    }

    public static void main(String[] args) {

        int p = 150; // периметр
        int k = 2; // во сколько раз длина больше высоты

        double result = SqArea.square(p, k);
        System.out.println("p = " + p + ", k = " + k + ", s = " + result + ", real = " + result);
    }
}
