package com.step.assignments.polymorphism;

public class Main {
    public static void main(String[] args) {
        Console console = new Console("random line");
        PDFpages pdfPage = new PDFpages();
        WebPage webPage = new WebPage(console);
        NonIntrectivePage nonIntrectivePage = new NonIntrectivePage(webPage);

        console.displayContent();

        System.out.println(pdfPage.getContent());
        webPage.displayContent();
        webPage.clickOnPage();

        System.out.println(webPage.getContent());
        nonIntrectivePage.clickOnPage();
        nonIntrectivePage.displayContent();

        System.out.println(nonIntrectivePage.getContent());
    }
}
