import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Create Locale objects
        Locale usLocale     = Locale.US;
        Locale indiaLocale  = new Locale("en", "IN");
        Locale chinaLocale  = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        // Create NumberFormat instances for each locale
        NumberFormat usFormat     = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat indiaFormat  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormat  = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);

        // Format the payment amount into currency strings
        String us     = usFormat.format(payment);
        String india  = indiaFormat.format(payment);
        String china  = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        
        // Print the formatted results
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
