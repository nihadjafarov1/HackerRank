import java.io.IOException;
import java.lang.reflect.Executable;
import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        byte h = sc.nextByte();

        if (b > 0 && h > 0){
            System.out.println(b * h);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
