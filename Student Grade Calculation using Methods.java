
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 marks: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;
        double average = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (a < 0 || a > 100 || b < 0 || b > 100 ||
            c < 0 || c > 100) {
            System.out.println("Invalid Marks");
        } else if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 75) {
            System.out.println("Grade B");
        } else if (average >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
