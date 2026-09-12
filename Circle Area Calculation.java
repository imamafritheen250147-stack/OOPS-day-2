class Shape {
    void display() {
        System.out.println("Shape Class");
    }
}

class Circle extends Shape {
    void area() {
        int radius = 7;
        double result = 3.14 * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area of Circle = " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}
