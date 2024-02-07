import java.util.Scanner;

public class Q02_TwistedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int c = 0;
        int temp = a;
        int d = 0;
        int sum = 0;
        for (int i=2; i<=Math.sqrt(a); i++){
            if (a%i==0){
                c++;
                break;
            }
        }
        while(a>0){
            int n = a%10;
            sum = sum*10*n;
            a = a/10;
        }
        for (int j=2; j<=Math.sqrt(sum); j++){
            if (sum%j==0){
                d++;
                break;
            }
        }
        if (c==0 && d==0){
            System.out.println(temp +" is twisted prime.");
        }
        else {
            System.out.println(temp +" is not twisted prime.");
        }
    }
}
