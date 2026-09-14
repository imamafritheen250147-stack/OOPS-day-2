import java.util.Scanner;

class Shape {
}

class Circle extends Shape {
    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    void area(double length, double width) {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        c.area(radius);

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Width: ");
        double width = sc.nextDouble();

        r.area(length, width);
    }
}
