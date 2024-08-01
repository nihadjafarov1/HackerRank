import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] numbers = new String[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            try {
                long number = Long.parseLong(numbers[i]);
                System.out.println(numbers[i] + " can be fitted in:");

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (NumberFormatException e) {
                System.out.println(numbers[i] + " can't be fitted anywhere.");
            }
        }
    }
}
