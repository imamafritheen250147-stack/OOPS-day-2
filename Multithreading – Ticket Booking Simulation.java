
class TicketBooking {
    int tickets = 3;

    synchronized void bookTicket(String name, int count) {
        if (tickets >= count) {
            tickets -= count;
            System.out.println(name + " booked " + count);
            System.out.println("Remaining: " + tickets);
        } else {
            System.out.println(name + ": Tickets unavailable");
        }
    }
}

class Customer extends Thread {
    TicketBooking booking;
    int count;

    Customer(TicketBooking booking, String name, int count) {
        super(name);
        this.booking = booking;
        this.count = count;
    }

    public void run() {
        booking.bookTicket(getName(), count);
    }
}

public class TicketDemo {
    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        Customer c1 = new Customer(booking, "Customer1", 2);
        Customer c2 = new Customer(booking, "Customer2", 2);

        c1.start();
        c2.start();
    }
}
