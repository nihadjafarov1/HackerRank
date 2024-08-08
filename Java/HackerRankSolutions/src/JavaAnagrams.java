import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine().toLowerCase();
        String s2 = sc1.nextLine().toLowerCase();

        boolean result = false;

        char[] arr = s1.toCharArray();
        Arrays.sort(arr);

        if (s1.length() == s2.length()) {
            for (int i = 0; ; ) {
                int tempCount = 0;
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        s1 = s1.substring(1);
                        s2 = s2.substring(0, j) + s2.substring(j + 1);
                        tempCount++;
                        break;
                    }
                }
                if (tempCount == 0)
                    break;
            }
            result = s1.equals(s2);
        }
        if (result) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
//    public static boolean areAnagrams(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//
//        char[] s1Array = s1.toCharArray();
//        char[] s2Array = s2.toCharArray();
//
//        Arrays.sort(s1Array);
//        Arrays.sort(s2Array);
//
//        return Arrays.equals(s1Array, s2Array);
//    }
}
