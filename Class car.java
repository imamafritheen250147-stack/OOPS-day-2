class Car {
    private String brand;
    private int speed;

    void setDetails(String b, int s) {
        brand = b;
        speed = s;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.setDetails("Toyota", 120);
        c.display();
    }
}
