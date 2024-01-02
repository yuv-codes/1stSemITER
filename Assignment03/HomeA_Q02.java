import java.util.Scanner;
public class HomeA_Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's day:  ");
        int day = sc.nextInt();
        System.out.print("Enter the number of days  elapsed: ");
        int elapsed = sc.nextInt();
       String today = "";
       String futureDay = "";
       switch(day){
           case 0 -> today = "Sunday";
           case 1 -> today = "Monday";
           case 2 -> today = "Tuesday";
           case 3 -> today = "Wednesday";
           case 4 -> today = "Thursday";
           case 5 -> today = "Friday";
           case 6 -> today = "Saturday";
       }
        switch ((day + elapsed) % 7) {
            case 0 -> futureDay = "Sunday";
            case 1 -> futureDay = "Monday";
            case 2 -> futureDay = "Tuesday";
            case 3 -> futureDay = "Wednesday";
            case 4 -> futureDay = "Thursday";
            case 5 -> futureDay = "Friday";
            case 6 -> futureDay = "Saturday";
        }

        System.out.println("Today is " + today + " and the future day is " + futureDay);
    }
}
