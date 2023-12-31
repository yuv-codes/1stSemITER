import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Q10_GradeAssigner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks scored: ");
        int num = sc.nextInt();
        String grade;

        switch (num / 10) {
            case 10, 9 -> grade = "O";
            case 8 -> grade = "A";
            case 7 -> grade = "B";
            case 6 -> grade = "C";
            case 5 -> grade = "D";
            case 4 -> grade = "E";
            default -> grade = "F";
        }

        System.out.println("Your Grade is: " + grade);

        sc.close();
        }
    }




