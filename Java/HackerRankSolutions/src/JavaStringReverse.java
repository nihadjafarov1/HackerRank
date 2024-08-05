import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

//        String reversedWord = "";
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversedWord += word.charAt(i);
//        }
//
//        System.out.println(reversedWord.equals(word) ? "Yes" : "No");

        boolean isPalindrome = true;
        int halfOfWord = word.length() / 2;
        int lastIndex = word.length() - 1;
        for (int i = 0; i < halfOfWord; i++) {
            if (word.charAt(i) != word.charAt(lastIndex - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Yes" : "No");

    }
}
