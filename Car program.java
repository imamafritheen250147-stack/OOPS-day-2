class Car {
    String model;
    String color;

    void start() {
        System.out.println(model + " (" + color + ") has started.");
    }

    void stop() {
        System.out.println(model + " has stopped.");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.model = "Tesla Model 3";
        c.color = "Red";

        c.start();
        c.stop();
    }
}
