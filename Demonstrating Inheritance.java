class Shape {
    void display() {
        System.out.println("Shape Class Method");
    }
}

class Circle extends Shape {
    void area() {
        double radius = 5;
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    void area() {
        double length = 10;
        double width = 5;
        System.out.println("Rectangle Area = " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}
