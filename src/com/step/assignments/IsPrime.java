package com.step.assignments;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("processing started...");
        System.out.println(nthPrimeNumber(10));
        System.out.println(nthPrimeNumber(100010));
        System.out.println("done");
    }

    public static boolean isNumberPrime(long number) {
        if (number < 2) return false;
        int sqareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= sqareRoot; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean is6kPlusMinusOneForm(long number) {
        boolean result = (number % 6 == 1) || (number % 6 == 5);
        return result;
    }

    public static Long nthPrimeNumber(int range) {
        int count = 2;
        long number = 1;
        if(range == 1) return 2L;
        if (range == 2) return 3L;
        while (count < range){
            number = number + 2;
            if(is6kPlusMinusOneForm(number)){
                if(isNumberPrime(number)) count++;
            }
        }
        return number;
    }
}
