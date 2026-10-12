import java.util.Scanner;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point p) {
        double dx = x - p.x;
        double dy = y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print("Point 1: ");
        p1.display();

        System.out.print("Point 2: ");
        p2.display();

        System.out.printf("Distance = %.2f%n", p1.distance(p2));
    }
}
