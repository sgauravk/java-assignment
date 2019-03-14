package com.step.assignments.learningSets;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(9);
        set2.add(3);
        set2.add(4);
        set2.add(8);
        LearningSet set = new LearningSet(set1, set2);
        System.out.println(set.getUnion());
        System.out.println(set.getIntersection());
        System.out.println(set.getDifference());
    }
}
