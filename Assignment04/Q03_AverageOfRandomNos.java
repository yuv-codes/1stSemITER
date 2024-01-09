import java.util.Scanner;

public class Q03_AverageOfRandomNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
    do {
        int ran = (int) (Math.random() * n + 1);
        System.out.println(ran + " ");
        sum = sum + ran;
        count++;
    }while (count < n);
        System.out.println();
        double average = (double) sum / n;
        System.out.println("Average of numbers: " + average);
    }
}
