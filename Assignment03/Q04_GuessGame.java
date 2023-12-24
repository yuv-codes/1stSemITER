import java.util.Scanner;
public class Q04_GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number between 1 to 9: ");
        int a = sc.nextInt();
        int b = 1 + (int)(Math.random()*9);
        System.out.println("Computer's Guess: " + b);
        if (b+1 == a ||  b-1==a){
            System.out.println("Almost got it!");
        }
        else if (a==b){
            System.out.println("You got it right");
        }
        else{
            System.out.println("You got it Wrong");
        }

    }
}
