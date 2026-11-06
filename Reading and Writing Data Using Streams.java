
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("You entered: " + text);
        sc.close();
    }
}
