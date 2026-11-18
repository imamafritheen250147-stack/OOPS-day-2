
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankException {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance");
        }

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " +
                           (balance - amount));
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
