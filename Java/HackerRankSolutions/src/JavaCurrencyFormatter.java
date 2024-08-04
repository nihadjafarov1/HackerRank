import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input = sc.nextDouble();

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(input));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(input));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(input));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(input));
    }
}
