import java.util.Scanner;

public class HomeA_Q04 {
    public static int word(String str){
        int count =1;
        for (int i=0; i<str.length()-1; i++){
            if ((str.charAt(i) == ' ' && str.charAt(i+1)!=' '))
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The number of words in the string is: " + word(s));
    }
}
