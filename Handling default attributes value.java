class Book {
    String title;
    String author;
}

class Main {
    public static void main(String[] args) {
        Book b = new Book();

        System.out.println("Default Values:");
        System.out.println("Title: " + b.title + ", Author: " + b.author);

        b.title = "Java Basics";
        b.author = "R. Kumar";

        System.out.println("After assigning values:");
        System.out.println("Title: " + b.title + ", Author: " + b.author);
    }
}
