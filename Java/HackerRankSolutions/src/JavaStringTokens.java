import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[ !,?._'@]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        s = s + " ";
//        String result = "";
//        for (int i = 0; i < s.length() - 1; i++) {
//            char temp = s.charAt(i);
//            if (Character.temp != ' ' && temp != '!' && temp != ',' && temp != '?' && temp != '.' && temp != '_' && temp != '\'' && temp != '@') {
//            char temp2 = s.charAt(i + 1);
//                result += temp;
//                if (temp2 == ' ' || temp2 == '!' || temp2 == ',' || temp2 == '?' || temp2 == '.' || temp2 == '_' || temp2 == '\'' || temp2 == '@') {
//                    result += " ";
//                }
//            }
//        }
//        result = result.trim();
//        String[] arr = result.split(" ");
//        if (result == "")
//            System.out.println(0);
//        else
//            System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++)
//            System.out.println(arr[i]);

    }
}
