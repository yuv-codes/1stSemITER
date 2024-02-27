import java.util.Scanner;

public class Q09_ValueOfTheSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = sc.nextInt();
        double sum = 0;
        for (int i=1; i<=N; i++){
            sum = sum + (double) 1/(i*i);
        }
        System.out.println(sum);
    }
}
