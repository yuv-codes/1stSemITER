import java.util.Scanner;

public class Q01_Calculator {
    public static int addition(int x , int y){
        return x+ y;
    }
    public static int subtraction(int x, int y){
        return x-y;
    }
    public static int multiplication(int x, int y){
        return x*y;
    }
    public static int division(int x, int y){
        return y/x;
    }
    public static int remainder(int x, int y){
        return x%y;
    }
    public static double sqrt(int n){
        return Math.sqrt(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator ( for sqrt type): ");
        sc.nextLine();
        char ch = sc.next().charAt(0);
        switch (ch){
            case '+' -> System.out.println("Addition of " + a + " and " + b + " is " + addition(a,b));
            case '-' -> System.out.println("Subtraction of " + a + " and " + b + " is " + subtraction(a,b));
            case '*' -> System.out.println("Multiplication of " + a + " and " + b + " is " + multiplication(a,b));
            case '/' -> System.out.println("Quotient of " + a + " and " + b + " is " + division(a,b));
            case '%' -> System.out.println("Remainder of " + a + " and " + b + " is " + remainder(a,b));
            case 'n' -> System.out.println("Sqrt of " + a + " and " + b + " are " + sqrt(a) + " and " + sqrt(b) + " respectively.");
            default -> System.out.println("Enter a valid operator");



        }
    }
}
