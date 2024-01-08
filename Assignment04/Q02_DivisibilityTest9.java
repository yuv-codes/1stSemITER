import java.util.Scanner;

public class Q02_DivisibilityTest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int n = number;
        int sum = 0;
        while (n>=1){
            sum = sum + n % 10;
            n = n / 10;
        }
        if (sum % 9 == 0){
            System.out.println("The number " + number + " is divisible by 9");
        }
        else {
            System.out.println("The number " + number + " is not divisible by 9");

        }
    }
}
