import java.util.Scanner;

class Shape {
    double length, width;

    void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}

class Rectangle extends Shape {
    void calculate() {
        area();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Enter Length: ");
        r.length = sc.nextDouble();

        System.out.print("Enter Width: ");
        r.width = sc.nextDouble();

        r.calculate();
    }
}
