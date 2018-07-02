package com.kodilla.random.numbers;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int n = UserDialogs.getNumber();
        Random random = new Random();
        int anInt = random.nextInt(n);
        System.out.println(anInt);
    }
}
