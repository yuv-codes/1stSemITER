import java.util.Scanner;

public class Q05_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
//        System.out.println("the factors are: ");
        for (int i=1; i<=num; i++){
            if (num%i==0){
//                System.out.println(i);
                sum = sum + i;
            }
        }if (sum==num) ;
            System.out.println(num + " is a perfect number");
    }
}
