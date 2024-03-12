import java.util.Scanner;

public class Q08_StringPalindrome {
    public static boolean isPalindrome(String str){
    int left = 0, right = str.length()-1;
    while(left<right){
        if (str.charAt(left) != str.charAt(right)){
            return false;
        }
        left ++;
        right --;
    }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(s + " is " + (isPalindrome(s)));
    }
}
