package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        double rsl = value / 70;
        return  rsl;
    }
    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
    }
    public static double euroToRuble(double value) {
        double rsl = value * 70;
        return rsl;
    }
    public static double dollarToRuble(double value) {
        double rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {

        int ruble = 621; // ДАНО
        /*
621 rubles are 8.871428571428572 euro.
621 rubles are 10.35 dollar.
8.871428571428572 euro are 621.0 rubles.
10.35 dollar are 621.0 rubles.
         */

        double euroRuble = Converter.rubleToEuro(ruble);
        double expectedRubleToEuro = 8.871428571428572;
        boolean passedRubleToEuro = euroRuble == expectedRubleToEuro;
        System.out.print(ruble + " rubles are " + euroRuble + " euro. ");
        System.out.println("Test result: " + passedRubleToEuro);

        double dollarRuble = Converter.rubleToDollar(ruble);
        double expectedRubleToDollar = 10.35;
        boolean passedRubleToDollar = dollarRuble == expectedRubleToDollar;
        System.out.print(ruble + " rubles are " + dollarRuble + " dollar. ");
        System.out.println("Test result: " + passedRubleToDollar);

        double rubleEuro = Converter.rubleToEuro(Converter.euroToRuble(ruble));
        double expectedEuroToRuble = 621;
        boolean passedEuroToRuble = rubleEuro == expectedEuroToRuble;
        System.out.print(euroRuble + " euro are " + rubleEuro + " rubles. ");
        System.out.println("Test result: " + passedEuroToRuble);

        double rubleDollar = Converter.rubleToDollar(Converter.dollarToRuble(ruble));
        double expectedDollarToRuble = 621;
        boolean passedDollarToRuble = rubleDollar == expectedDollarToRuble;
        System.out.print(dollarRuble + " dollar are " + rubleDollar + " rubles. ");
        System.out.println("Test result: " + passedDollarToRuble);
    }
}
