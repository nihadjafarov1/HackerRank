import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String sequence = sc.nextLine();
            String[] sarr = sequence.split(" ");
            int a = Integer.parseInt(sarr[0]);
            int b = Integer.parseInt(sarr[1]);
            int n = Integer.parseInt(sarr[2]);

            int result = a;

            for (int j = 0; j < n; j++) {
                result += Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
