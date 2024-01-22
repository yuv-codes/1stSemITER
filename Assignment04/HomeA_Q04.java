import java.util.Scanner;

public class HomeA_Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i=1; i<=num; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
            else if (i % 2 == 1) {
                product = product * i;
            }
        }
        System.out.println("Sum of all even numbers = " + sum);
        System.out.println("Products of all odd numbers = " + product);

    }
}
