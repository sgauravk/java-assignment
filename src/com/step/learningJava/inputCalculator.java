package com.step.learningJava;

import java.util.Scanner;

public class inputCalculator {

    public static void main(String[] args) {
        inputAndThenPrintSumAndAverage();
    }

    public static void inputAndThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double length = 0;
        System.out.println("Enter your input: ");
        while (scanner.hasNext()) {
            if (!scanner.hasNextInt()) break;
            sum += scanner.nextInt();
            length++;
        }
        double average = (sum / length);
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        scanner.close();
    }

}
