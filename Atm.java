class ATM {
    int balance = 10000;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        ATM a = new ATM();

        a.deposit(5000);
        a.withdraw(2000);

        a.displayBalance();
    }
}
