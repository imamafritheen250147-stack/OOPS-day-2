import java.util.Scanner;

class Shape {
    double radius;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Circle extends Shape {
    void calculate() {
        area();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter Radius: ");
        c.radius = sc.nextDouble();

        c.calculate();
    }
}
