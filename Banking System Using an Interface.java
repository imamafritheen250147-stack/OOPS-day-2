
interface Bank {
    double calculateInterest(double principal);
}

class BankA implements Bank {
    public double calculateInterest(double principal) {
        return principal * 5 * 1 / 100;
    }
}

class BankB implements Bank {
    public double calculateInterest(double principal) {
        return principal * 7 * 1 / 100;
    }
}

public class Interface36 {
    public static void main(String[] args) {
        Bank a = new BankA();
        Bank b = new BankB();

        System.out.println("Bank A interest: "
                           + a.calculateInterest(10000));
        System.out.println("Bank B interest: "
                           + b.calculateInterest(10000));
    }
}
