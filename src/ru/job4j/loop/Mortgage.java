package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 1;
        double balance = (amount + (amount / 100 * percent)) - salary;
        while (balance >= 0) {
            year++;
            balance = (balance + (balance / 100 * percent)) - salary;
        }
        return year;
    }
}