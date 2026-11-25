
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        int choice;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit Successful");
                    } else {
                        System.out.println("Invalid Amount");
                    }
                    break;

                case 3:
                    System.out.print("Enter Withdrawal: ");
                    double amount = sc.nextDouble();

                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal Successful");
                    } else {
                        System.out.println("Invalid Amount");
                    }
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
