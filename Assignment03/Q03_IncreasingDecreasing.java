import java.util.Scanner;
public class Q03_IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = sc.nextInt();
        System.out.println("Input second number: ");
        int num2 = sc.nextInt();
        System.out.println("Input third number: ");
        int num3 = sc.nextInt();
        if (num1<num2 && num2<num3){
            System.out.println("Increasing");
        }
        else if (num1<num2 && num2>num3){
            System.out.println("Neither Increasing nor decreasing");
        }
        else if (num1>num2 && num2>num3) {
            System.out.println("Decreasing");
        }

    }
}
