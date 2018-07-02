package com.kodilla.random.numbers;

import java.util.Scanner;

public class UserDialogs {
    private String name;
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number: ");
            String s = scanner.nextLine();
            try {
                int result = Integer.parseInt(s);
                return result;
            } catch (Exception e){
                System.out.println("wrong number!");
            }
        }
    }

    public UserDialogs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserDialogs{" +
                "name='" + name + '\'' +
                '}';
    }
}
