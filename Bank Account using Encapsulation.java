
class BankAccount {
    private double balance = 1000;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void display() {
        System.out.println("Balance: " + balance);
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(500);
        account.display();
    }
}
