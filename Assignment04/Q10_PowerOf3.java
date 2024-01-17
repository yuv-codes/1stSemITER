import java.util.Scanner;

public class Q10_PowerOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int power = 3;
        while(power < num) {
            power = power * 3;
        }
        power = power/3;
        System.out.println("The largest power of 3 less than or equal to "+ num + " is " + power);
        }
    }
