import java.util.Scanner;

class MultipleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);

            int[] arr = {10, 20, 30};
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Array value = " + arr[index]);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

        catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }

        finally {
            System.out.println("Program execution completed.");
        }
    }
}
