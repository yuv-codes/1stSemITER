import java.util.Scanner;

public class Q04_FindingGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        while(num2 != 0){
           int temp = num2;
           num2 = num1 % num2;
           num1 = temp;
        }
        System.out.println("GCD = " + num1);
    }
}
