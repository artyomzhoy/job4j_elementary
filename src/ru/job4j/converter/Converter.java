package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro (double value) {
        double rsl = value / 70;
        return  rsl;
    }
    public static double rubleToDollar (double value) {
        double rsl = value / 60;
        return rsl;
    }
    public static double euroToRuble (double value) {
        double rsl = value * 70;
        return rsl;
    }
    public static double dollarToRuble (double value) {
        double rsl = value * 60;
        return rsl;
    }

    public static void main (String[] args) {

        int ruble = 621; // ДАНО

        double euroRuble = rubleToEuro(ruble);
        System.out.println (ruble + " rubles are " + euroRuble + " euro.");

        double dollarRuble = rubleToDollar(ruble);
        System.out.println (ruble + " rubles are " + dollarRuble + " dollar.");

        double rubleEuro = rubleToEuro(euroToRuble(ruble));
        System.out.println (euroRuble + " euro are " + rubleEuro + " rubles.");

        double rubleDollar = rubleToDollar(dollarToRuble(ruble));
        System.out.println (dollarRuble + " dollar are " + rubleDollar + " rubles.");
    }
}
