class Book {
    String title;
    String author;

    void display() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "Java Programming";
        b1.author = "James";

        b2.title = "Python Basics";
        b2.author = "Guido";

        b1.display();
        b2.display();
    }
}
