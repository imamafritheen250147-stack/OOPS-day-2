class Taxi {
    String driver;
    int distance;
    int rate;

    void calculateFare() {
        int fare = distance * rate;

        System.out.println("Driver: " + driver);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }
}

public class Main {
    public static void main(String[] args) {
        Taxi t = new Taxi();

        t.driver = "Arun";
        t.distance = 10;
        t.rate = 20;

        t.calculateFare();
    }
}
