class Book {
    String title;
    String author;
}

class Main {
    public static void main(String[] args) {
        Book b = new Book();

        b.title = "Java Basics";
        b.author = "R. Kumar";

        System.out.println("Before update:");
        System.out.println("Title: " + b.title + ", Author: " + b.author);

        b.title = "Advanced Java";

        System.out.println("After update:");
        System.out.println("Title: " + b.title + ", Author: " + b.author);
    }
}
