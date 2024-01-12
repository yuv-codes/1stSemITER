import java.util.Scanner;

public class Q06_RaisedPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int base = sc.nextInt();
        System.out.println("Enter 2nd number");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++){
            result = result * base;
        }
        System.out.println(base + "^" + power + " = " + result);
    }
}
