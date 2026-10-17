import java.util.Scanner;

class Car {
    String model;
    String color;
    int year;
    double price;

    void display() {
        System.out.println("\nCar Details");
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Year  : " + year);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();

        System.out.print("Enter car model: ");
        c.model = sc.nextLine();

        System.out.print("Enter car color: ");
        c.color = sc.nextLine();

        System.out.print("Enter car year: ");
        c.year = sc.nextInt();

        System.out.print("Enter car price: ");
        c.price = sc.nextDouble();

        c.display();

        sc.close();
    }
}
