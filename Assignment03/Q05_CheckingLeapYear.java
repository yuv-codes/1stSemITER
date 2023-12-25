import java.util.Scanner;
public class Q05_CheckingLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = sc.nextInt();
        if(year%100==0){
            if (year%400==0){
                System.out.println("Its a leap Year");
            }else {
                System.out.println("Its not a leap year");
            }

        }else if (year%4==0){
            System.out.println("Its a leap Year");
        }else {
            System.out.println("Its not a leap year");
        }
    }
}
