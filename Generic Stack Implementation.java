
import java.util.*;

class StackBox<T> {
    private ArrayList<T> list = new ArrayList<>();

    void push(T item) {
        list.add(item);
    }

    T pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    void display() {
        System.out.println(list);
    }
}

public class Generic26 {
    public static void main(String[] args) {
        StackBox<Integer> s = new StackBox<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.print("Stack: ");
        s.display();

        System.out.println("Popped: " + s.pop());

        System.out.print("After pop: ");
        s.display();
    }
}
