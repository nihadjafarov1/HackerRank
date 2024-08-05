import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int index = k; index <= s.length(); index++) {
            if (smallest.compareTo(s.substring(index - k, index)) > 0) {
                smallest = s.substring(index - k, index);
            }
            if (largest.compareTo(s.substring(index - k, index)) < 0) {
                largest = s.substring(index - k, index);
            }
        }

// When i write this code for first time i did not compareTo() method of String class. That is why i got with different way :)
//        for (int i = 0; i < s.length() - (n - 1); i++) {
//            String tempSmallest = s.substring(i, i + n);
//            String tempLargest = s.substring(i, i + n);
//
//            if (tempSmallest.charAt(0) < smallest.charAt(0)){
//                smallest = tempSmallest;
//            }
//            else if (tempSmallest.charAt(0) == smallest.charAt(0)){
//                for (int j = 1; j < n; j++) {
//                    if (tempSmallest.charAt(j) > smallest.charAt(j)){
//                        break;
//                    }
//                    else if (tempSmallest.charAt(j) < smallest.charAt(j)){
//                        smallest = tempSmallest;
//                    }
//                }
//            }
//            if (tempLargest.charAt(0) > largest.charAt(0)){
//                largest = tempLargest;
//            }
//            else if (tempLargest.charAt(0) == largest.charAt(0)){
//                for (int j = 1; j < n; j++) {
//                    if (tempLargest.charAt(j) < largest.charAt(j)){
//                        break;
//                    }
//                    else if (tempLargest.charAt(j) > largest.charAt(j)){
//                        largest = tempLargest;
//                    }
//                }
//            }
//
//        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

    }
}
