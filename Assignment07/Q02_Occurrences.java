import java.util.Scanner;

public class Q02_Occurrences {
    public static void main(String[] args) {
        int[] count = new int[101];
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers between 1 to 100: ");
        do {
            n = sc.nextInt();
            count[n]++;
        }
        while (n!=0);
        for (int i=1; i<=100; i++){
            if (count[i]>0)
                System.out.println(i + " occurs " + count[i] + ((count[i]>1)?" times.":" time."));
        }

    }
}
