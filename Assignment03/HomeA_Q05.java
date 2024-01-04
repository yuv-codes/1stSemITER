import java.util.Scanner;

public class HomeA_Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        char gender = sc.next().charAt(0);
        System.out.print("First Name: ");
        String Fname = sc.next();
        System.out.print("Last Name: ");
        String Lname = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        if (gender == 'm'){
            System.out.println("Then I shall call you Mr. " + Fname + Lname);
        }
        if (gender == 'f'){
            System.out.print("Are you married, " + Fname + " (y or n): ");
        }
        char marraige = sc.next().charAt(0);
        if (gender == 'f' && marraige == 'y'){
            System.out.println("Then I shall call you Mrs. " + Fname +" " + Lname);
        }else {
            System.out.println("Then I shall call you Ms. " + Fname +" " + Lname);
        }
    }
}
