package com.step.assignments.polymorphism;

public class WebPage {
    private PDFpages pagecontent;
    private Console console;

    public WebPage(Console console) {
        this.pagecontent = new PDFpages();
        this.console = console;
    }

    public String getContent(){
        return pagecontent.getContent();
    }

    public void clickOnPage(){
        System.out.println("clicked successfully");
    }

    public void displayContent(){
        this.console.displayContent();
    }
}
