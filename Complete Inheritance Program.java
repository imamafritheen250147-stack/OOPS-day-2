class Shape {
    void display() {
        System.out.println("Area Calculation");
    }
}

class Circle extends Shape {
    void area() {
        double radius = 5;
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    void area() {
        double length = 10;
        double width = 5;

        System.out.println("Area of Rectangle = " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();
        r.area();
    }
}