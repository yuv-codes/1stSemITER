import java.util.Scanner;
public class Q09_FindingLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is " + b);
        } else if (c > b && c > a) {
            System.out.println("The largest number is " + c);
        }
        if (a > b && a < c) {
            System.out.println("The 2nd largest number is " + a);
        } else if (b > a && b < c) {
            System.out.println("The 2nd largest number is " + b);
        } else if (c > b && c < a) {
            System.out.println("The 2nd largest number is " + c);
        }
    }
}
