class Mobile {
    private String brand;
    private double price;

    void setDetails(String b, double p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile();

        m.setDetails("Samsung", 25000);
        m.display();
    }
}
