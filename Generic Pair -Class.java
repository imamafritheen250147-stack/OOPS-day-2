
class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

public class Generic25 {
    public static void main(String[] args) {
        Pair<String, Integer> p =
            new Pair<>("Ravi", 101);

        p.display();
    }
}
