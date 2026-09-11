class Shape {
    String color = "Red";
}

class Circle extends Shape {
    void display() {
        System.out.println("Shape Color = " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}
