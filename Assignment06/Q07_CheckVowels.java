import java.util.Scanner;

public class Q07_CheckVowels {
    public static int count(String str){
        int vowel = 0;
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel++;
        }
        return vowel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("Number of vowels in the given word " + s + " is: " + count(s));
    }
}
