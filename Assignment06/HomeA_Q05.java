import java.util.Scanner;

public class HomeA_Q05 {
    public static boolean consecutiveIntegers(int a, int b, int c){
        if ((a+1 == b && b+1 == c) || (c+1 == b && b+1 == a))
        return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println("Check whether the three numbers are consecutive or not!\n" + consecutiveIntegers(a,b,c));
    }
}
