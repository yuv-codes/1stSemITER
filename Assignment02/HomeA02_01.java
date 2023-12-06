import java.util.Scanner;
public class HomeA02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minute = sc.nextLong();
        long MinutesInYear = 525600;
        long year = minute/MinutesInYear;
        long day = (minute/60/24)%365;
        System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days.");
    }
}
