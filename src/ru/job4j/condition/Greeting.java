package ru.job4j.condition;

public class Greeting {
    public static void main (String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String newbie = "But I am a newbie.";
        String separate = " ";
        int year = 2020;
        idea = idea + separate + newbie + separate + year;
        System.out.println(idea);
    }
}
