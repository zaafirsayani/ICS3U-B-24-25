package day2;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;

    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = 2000;
        this.price = 9.99;

    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown Author";
        this.yearPublished = 2000;
        this.price = 9.99;
    }

    public void diplayDetails() {
        System.out.println(
                "Title: " + title + "Author: " + author + "Year Published: " + yearPublished + "Price: " + price);

    }

    public void displayDetails(boolean showTitleAndAuthorOnly){
        if (showTitleAndAuthorOnly){
            System.out.println("Title: " + title + "Author: " + author);
        }
    }
}
