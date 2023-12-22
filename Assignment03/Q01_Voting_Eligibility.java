import java.util.Scanner;
public class Q01_Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.print("You are eligible to cast vote!");
        }
        else {
            System.out.print("You are not eligible to cast vote");
        }
    }
}
