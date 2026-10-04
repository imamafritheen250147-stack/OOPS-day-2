interface Payment {
    void pay(double amount);
    void generateReceipt();
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Cash Payment: Rs. " + amount);
    }

    public void generateReceipt() {
        System.out.println("Cash Payment Receipt Generated");
    }
}

class OnlinePayment implements Payment {
    public void pay(double amount) {
        System.out.println("Online Payment: Rs. " + amount);
    }

    public void generateReceipt() {
        System.out.println("Online Payment Receipt Generated");
    }
}

public class Main {
    public static void main(String[] args) {
        CashPayment cash = new CashPayment();
        OnlinePayment online = new OnlinePayment();

        cash.pay(500.0);
        cash.generateReceipt();

        online.pay(1200.0);
        online.generateReceipt();
    }
}
