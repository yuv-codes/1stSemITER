import java.util.Scanner;

public class Q01_AmicableNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i=1; i<num1; i++){
            if (num1%i == 0){
                System.out.println(i);
                sum1 = sum1 + i;
            }
        }
        System.out.println("Sum1 = " + sum1);
        for (int j=1; j<num2; j++){
            if (num2%j == 0){
                System.out.println(j);
                sum2 = j + sum2;
            }
        }
        System.out.println("Sum2 = " + sum2);
        if (sum1 == num2 && sum2 == num1){
            System.out.println(num1 + " and " + num2 + " are amicable numbers");
        }
        else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers");
        }
    }
}
