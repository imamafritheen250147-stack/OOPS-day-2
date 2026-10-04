interface Payment {
    void pay();
    void generateReceipt();
}

class CashPayment implements Payment {
    public void pay() {
        System.out.println("Cash Payment: Rs. 500.0");
    }

    public void generateReceipt() {
        System.out.println("Cash Payment Receipt Generated");
    }
}

class OnlinePayment implements Payment {
    public void pay() {
        System.out.println("Online Payment: Rs. 1200.0");
    }

    public void generateReceipt() {
        System.out.println("Online Payment Receipt Generated");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CashPayment();
        p.pay();
        p.generateReceipt();

        System.out.println();

        p = new OnlinePayment();
        p.pay();
        p.generateReceipt();
    }
}
