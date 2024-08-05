import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        String check;
        if (line1.charAt(0) > line2.charAt(0))
            check = "Yes";
        else
            check = "No";

        line1 = line1.substring(0,1).toUpperCase() + line1.substring(1);
        line2 = line2.substring(0,1).toUpperCase() + line2.substring(1);

        System.out.println(line1.length() + line2.length());
        System.out.println(check);
        System.out.println(line1 + " " + line2);
    }
}
