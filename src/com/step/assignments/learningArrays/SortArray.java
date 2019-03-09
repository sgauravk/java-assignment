package com.step.assignments.learningArrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {106, 26, 81, 5, 15};
        int[] sortedList = getSortedList(numbers);
        printSortedList(sortedList);
    }

    public static int getMax(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) max = list[i];
        }
        return max;
    }

    public static int[] getSortedList(int[] list) {
        int[] sortedList = new int[list.length];
        byte count = 0;
        while (list.length > 0) {
            int maxNumber = getMax(list);
            sortedList[count] = maxNumber;
            list = removeArrayElement(maxNumber, list);
            count++;
        }
        return sortedList;
    }

    public static int[] removeArrayElement(int number, int[] list) {
        boolean isRemoved = false;
        int[] result = new int[list.length - 1];
        byte count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != number || isRemoved) result[count++] = list[i];
            if (list[i] == number) isRemoved = true;
        }
        return result;
    }

    public static void printSortedList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
