
class Vehicle {
    double calculateRent(int days) {
        return 0;
    }
}

class Car extends Vehicle {
    double calculateRent(int days) {
        return days * 1500;
    }
}

class Bike extends Vehicle {
    double calculateRent(int days) {
        return days * 500;
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        System.out.println("Car Rent: " +
                           v1.calculateRent(2));

        System.out.println("Bike Rent: " +
                           v2.calculateRent(2));
    }
}
