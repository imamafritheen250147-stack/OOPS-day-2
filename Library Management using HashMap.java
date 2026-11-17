
import java.util.HashMap;

public class Library {
    public static void main(String[] args) {

        HashMap<Integer, String> books = new HashMap<>();

        books.put(101, "Java");
        books.put(102, "Python");
        books.put(103, "Database");

        System.out.println("Books: " + books);

        int id = 102;

        if (books.containsKey(id)) {
            System.out.println("Book Found: " + books.get(id));
        } else {
            System.out.println("Book Not Found");
        }
    }
}
