package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner system = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String text = system.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println(text + ": Yes");
        } else if (answer == 1) {
            System.out.println(text + ": No");
        } else {
            System.out.println(text + ": Maybe");
        }
    }
}
