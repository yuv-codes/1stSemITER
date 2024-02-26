import java.util.Scanner;

public class Q08_SumOfTheSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=N; i++){
            for (int j=1; j<=i; j++){
                sum = sum + j;
            }
        }
        System.out.println("The sum is: " + sum);

    }
}
