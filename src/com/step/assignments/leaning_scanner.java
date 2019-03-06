package com.step.assignments;

import java.util.Scanner;

public class leaning_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Name = scanner.nextLine();
        System.out.println("hello " + Name + " welcome to my world");
        scanner.close();
    }
}