import java.util.Scanner;

public class Q07_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the table of: ");
        int num = sc.nextInt();
        int result = 1;
        for (int i=1; i<=10; i++){
            result = num * i;
            System.out.println(num + " x " + i + " = " +result);
        }

    }
}
