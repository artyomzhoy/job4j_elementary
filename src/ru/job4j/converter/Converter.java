package ru.job4j.converter;

/**
 * Converter.
 *
 * @author Artyom Samoshin
 */

public class Converter {
    /**
     * Method rubleToEuro.
     * @param value - ruble.
     * @return rubleToEuro - convertation ruble to euro.
     */
    public static double rubleToEuro(double value) {
        double rsl = value / 70;
        return  rsl;
    }
    /**
     * Method rubleToDollar.
     * @param value - ruble.
     * @return rubleToDollar - convertation ruble to dollar.
     */
    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
    }
    /**
     * Method euroToRuble.
     * @param value - rubleToEuro(ruble).
     * @return euroToRuble - convertation euro to ruble.
     */
    public static double euroToRuble(double value) {
        double rsl = value * 70;
        return rsl;
    }
    /**
     * Method dollarToRuble.
     * @param value - rubleToDollar(ruble).
     * @return dollarToRuble - convertation dollar to ruble.
     */
    public static double dollarToRuble(double value) {
        double rsl = value * 60;
        return rsl;
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {

        int ruble = 621;
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
