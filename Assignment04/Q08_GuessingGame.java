import java.util.Scanner;

public class Q08_GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.println("Choose a number between 1 to 10: ");
            int num = sc.nextInt();
            int ran = (int)(Math.random()*10 + 1);
            count = count + 1;
            System.out.println("Computer's guess: " + ran);
            if(num == ran ){
                System.out.println("You got it right !");
                System.out.println("You took " + count + " iterations.");
                break;
            }else if (num < ran){
                System.out.println("Too low, try again !");
            }else if (num > ran){
                System.out.println("Too high, try again !");
            }
        }

    }
}
