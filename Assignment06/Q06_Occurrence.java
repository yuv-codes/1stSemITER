import java.util.Scanner;

public class Q06_Occurrence {
    public static int count(String str, char a){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==a) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("The of occurrence character " + ch + " in the word " + s + " is " + count(s,ch));
    }
}
