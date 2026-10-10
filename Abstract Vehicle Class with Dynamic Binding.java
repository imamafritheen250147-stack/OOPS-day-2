import java.util.Scanner;

abstract class Vehicle {

    abstract double calculateMileage();

    abstract void displaySpecification();
}

class Car extends Vehicle {

    double distance, fuel;

    Car(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    double calculateMileage() {
        return distance / fuel;
    }

    void displaySpecification() {
        System.out.println("Vehicle: Car");
        System.out.println("Mileage: " + calculateMileage());
    }
}

class Bike extends Vehicle {

    double distance, fuel;

    Bike(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    double calculateMileage() {
        return distance / fuel;
    }

    void displaySpecification() {
        System.out.println("Vehicle: Bike");
        System.out.println("Mileage: " + calculateMileage());
    }
}

class Bus extends Vehicle {

    double distance, fuel;

    Bus(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    double calculateMileage() {
        return distance / fuel;
    }

    void displaySpecification() {
        System.out.println("Vehicle: Bus");
        System.out.println("Mileage: " + calculateMileage());
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(500, 25),
            new Bike(300, 10),
            new Bus(400, 50)
        };

        for (Vehicle v : vehicles) {
            v.displaySpecification();
            System.out.println();
        }
    }
}
