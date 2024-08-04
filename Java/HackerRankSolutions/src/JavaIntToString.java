import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            byte input = sc.nextByte();
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
