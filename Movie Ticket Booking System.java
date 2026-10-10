import java.io.*;

interface Payment {
    void pay(double amount);
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using Card: Rs." + amount);
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using UPI: Rs." + amount);
    }
}

public class Main {

    static double ticketCost(String category) {

        if (category.equalsIgnoreCase("Silver"))
            return 150;

        if (category.equalsIgnoreCase("Gold"))
            return 250;

        if (category.equalsIgnoreCase("Premium"))
            return 350;

        throw new IllegalArgumentException("Invalid seat category");
    }

    public static void main(String[] args) {

        String category = "Gold";
        int seats = 2;

        try {

            if (seats <= 0)
                throw new IllegalArgumentException("Invalid number of seats");

            double total = ticketCost(category) * seats;

            System.out.println("Seat Category: " + category);
            System.out.println("Seats: " + seats);
            System.out.println("Total: Rs." + total);

            Payment payment = new UpiPayment();
            payment.pay(total);

            FileWriter fw =
                new FileWriter("booking.txt", true);

            fw.write("Category: " + category
                    + ", Seats: " + seats
                    + ", Amount: Rs." + total + "\n");

            fw.close();

            System.out.println("Booking saved successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println("Booking Error: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}
