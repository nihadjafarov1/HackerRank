import java.util.Date;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        Date d = new Date(year - 1900, month - 1, day);
        int intDay = d.getDay();
        switch (intDay) {
            case 0:
                return "SUNDAY";
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
        }
        return "";
    }
}
