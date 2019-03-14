package com.step.assignments.polymorphism;

public class NonIntrectivePage {
    private WebPage webPage;

    public NonIntrectivePage(WebPage webPage) {
        this.webPage = webPage;
    }

    public String getContent(){
        return this.webPage.getContent();
    }

    public void clickOnPage(){
        System.out.println("click not supported");
    }

    public void displayContent(){
        this.webPage.displayContent();
    }
}
