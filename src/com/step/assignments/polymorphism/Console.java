package com.step.assignments.polymorphism;

public class Console {
    private String content;

    public Console(String content) {
        this.content = content;
    }

    public void displayContent(){
        System.out.println(this.content);
    }
}
