
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (password.length() >= 8 && hasDigit) {
            System.out.println("Password Accepted");
        } else {
            System.out.println("Password Rejected");
        }

        sc.close();
    }
}
