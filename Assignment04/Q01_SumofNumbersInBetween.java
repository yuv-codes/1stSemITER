import java.util.Scanner;

public class Q01_SumofNumbersInBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2 ; i = i + num3)
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}
