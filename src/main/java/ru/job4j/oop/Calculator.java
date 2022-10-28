package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public int divide(int number) {
        return number / x;
    }

    public int multiple(int number) {
        return number * x;
    }

    public static int minus(int number) {
        return number - x;
    }

    public int sumAllOperation(int number) {
        return minus(number) + divide(number) + sum(number) + multiple(number);
    }

    public static int sum(int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        System.out.println(sum(10));
        System.out.println(minus(20));
        Calculator  calculator = new Calculator();
        System.out.println(calculator.divide(10));
        System.out.println(calculator.multiple(10));
        System.out.println(calculator.sumAllOperation(10));
    }
}
