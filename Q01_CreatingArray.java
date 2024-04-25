import java.util.Scanner;

public class Q01_CreatingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        for (int i=0; i<n; i++){
            arr[i]=1+(int)(Math.random()*(n-1));
            sum = sum + arr[i];
        }
        System.out.println("the sum is: " + sum);
        System.out.println("The average is: " + (sum/n));
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
