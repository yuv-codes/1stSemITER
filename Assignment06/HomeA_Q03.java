import java.util.Scanner;

public class HomeA_Q03 {
    public static String middleChar(String str){
        int length = str.length();
        if (length/2==0)
            return str.substring(length/2,(length+1)/2);
        else
            return str.substring(length/2,(length+2)/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The middle character in the string " + s + " is: " + middleChar(s));
    }
}
