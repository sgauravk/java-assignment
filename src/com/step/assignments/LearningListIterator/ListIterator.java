package com.step.assignments.LearningListIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private int currentIndex;
    private List<Integer> list;

    public ListIterator(List<Integer> list) {
        this.currentIndex = -1;
        this.list = list;
    }

    public boolean hasNext() {
        if (this.currentIndex >= this.list.size() - 1) return false;
        return true;
    }

    public int next() {
        if (hasNext()) {
            this.currentIndex++;
            return this.list.get(this.currentIndex);
        }
        throw new NoSuchElementException("All elements are visited already");
    }
}
