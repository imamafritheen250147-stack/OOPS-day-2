import java.util.Scanner;

class Shape {
    double radius, length, width;
}

class Circle extends Shape {

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.print("Enter Radius: ");
        c.radius = sc.nextDouble();

        System.out.print("Enter Length: ");
        r.length = sc.nextDouble();

        System.out.print("Enter Width: ");
        r.width = sc.nextDouble();

        c.calculateArea();
        r.calculateArea();

        sc.close();
    }
}