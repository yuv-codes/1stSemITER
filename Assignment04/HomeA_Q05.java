import java.util.Scanner;

public class HomeA_Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input, N = ");
        int N = sc.nextInt();
        String j = "1";
        for(int i=2; i<=N; i++){
            j = j + i + j ;
            System.out.println(j);
        }
        System.out.println();

    }
}
