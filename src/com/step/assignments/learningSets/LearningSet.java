package com.step.assignments.learningSets;

import java.util.HashSet;
import java.util.Set;

public class LearningSet {
    private Set set1;
    private Set set2;
    private Set union;
    private Set intersection;
    private Set difference;

    public LearningSet(Set set1, Set set2) {
        this.set1 =  set1;
        this.set2 = set2;
    }

    public Set getUnion(){
        this.union = new HashSet<>(Set.copyOf(this.set1));
        this.union.addAll(this.set2);
        return this.union;
    }

    public Set getIntersection(){
        this.intersection =  new HashSet<>(Set.copyOf(this.set1));
        this.intersection.retainAll(this.set2);
        return this.intersection;
    }

    public Set getDifference(){
        this.difference =  new HashSet<>(Set.copyOf(this.set1));
        this.difference.removeAll(set2);
        return this.difference;
    }
}
