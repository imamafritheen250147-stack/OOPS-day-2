
import java.util.Scanner;

class BasicInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");

        sc.close();
    }
}
