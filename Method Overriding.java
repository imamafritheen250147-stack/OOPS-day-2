class Shape {
    void display() {
        System.out.println("Display Method in Shape Class");
    }
}

class Circle extends Shape {
    @Override
    void display() {
        System.out.println("Display Method in Circle Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}
