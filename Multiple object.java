class Book {
    String title;
    String author;

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.title = "Java Basics";
        b1.author = "R. Kumar";

        b2.title = "Data Structures";
        b2.author = "S. Menon";

        b3.title = "Operating Systems";
        b3.author = "A. Verma";

        b1.display();
        b2.display();
        b3.display();
    }
}
