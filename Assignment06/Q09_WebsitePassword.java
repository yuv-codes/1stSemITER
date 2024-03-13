
import java.util.Scanner;

public class Q09_WebsitePassword {
    public static boolean passwordRules(String password){
        if (password.length()<8){
            return false;
        }
        for (int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)){
                return false;
            }
        }
        int count = 0;
        for (int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if (Character.isDigit(ch)){
                count++;
            }
        }
        if (count<2){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        if (passwordRules(password)){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}
