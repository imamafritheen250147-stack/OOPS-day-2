import java.util.Scanner;

class Car {
    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void start() {
        System.out.println(model + " (" + color + ") has started.");
    }

    void stop() {
        System.out.println(model + " (" + color + ") has stopped.");
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter car color: ");
        String color = sc.nextLine();

        Car car = new Car(model, color);

        car.display();
        car.start();
        car.stop();
    }
}
