class Shopping {
    void bill(int price) {
        System.out.println("Total: ₹" + price);
    }

    void bill(int price, int quantity) {
        System.out.println("Total: ₹" + (price * quantity));
    }
}

public class Main {
    public static void main(String[] args) {
        Shopping s = new Shopping();

        s.bill(500);
        s.bill(200, 3);
    }
}
