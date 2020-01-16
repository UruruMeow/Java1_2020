package ru.geekbrains.java1;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println(calculation(2, 5, 11, 6));
        System.out.println("Число в пределах от 10 до 20? " + limits(1, 8));
        System.out.println("Число положительное? " + positive_negative(6));
        greetings("Oksana");
        System.out.println("Год високосный? " + leap_year(1700));
    }
    private static float calculation(int a, int b, int c, int d) {
        float result;
        result = a * (b + (c / 1f / d));
        return result;
    }
    private static boolean limits(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;

    }
    private static boolean positive_negative(int a) {
        return a >= 0;
    }
    private static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }
    private static boolean leap_year(int a) {
        int c = a % 4;
        int b = a % 400;
        int d = a % 100;
        return  (c == 0 && d != 0 || b == 0);
    }
}