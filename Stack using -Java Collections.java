
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Type");
        s.push("Copy");
        s.push("Paste");

        System.out.println("Stack: " + s);

        System.out.println("Top Element: " + s.peek());

        System.out.println("Removed: " + s.pop());

        System.out.println("Updated Stack: " + s);
    }
}
