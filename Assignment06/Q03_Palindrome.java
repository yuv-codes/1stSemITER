import java.util.Scanner;

public class Q03_Palindrome {
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            int r = n % 10;
            rev = rev*10*r;
            n = n/10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n){
        if (n == reverse(n))
            return true;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println(n+ " " + isPalindrome(n));
    }
}
