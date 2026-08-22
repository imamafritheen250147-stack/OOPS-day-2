class BankAccount {
    private String name;
    private double balance;

    void createAccount(String n, double b) {
        name = n;
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.createAccount("Arun", 5000);
        account.deposit(2000);

        account.display();
    }
}
