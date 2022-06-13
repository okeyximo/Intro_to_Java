package com.okeyximo;

import java.util.Scanner;

public class ReadingUserInput {
    public static Scanner scanner = new Scanner(System.in);
    public static void readingUserInput(){
        boolean hasNextInt = scanner.hasNextInt();
        System.out.println("Enter your year of birth :");
        if (hasNextInt){
            int age = 2022 - scanner.nextInt();
            scanner.nextLine();
            if (age < 1 || age > 100){
                System.out.println("Invalid year of birth.");
                }
            else {
                System.out.println("Input your name: ");
                String name = scanner.nextLine();
                System.out.println("Your name is " + name +
                        ", You are " + age + " years old.");
            }
        }
        else System.out.println("Invalid Input");

        scanner.close();
    }
}
