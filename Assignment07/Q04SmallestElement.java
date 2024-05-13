import java.util.Scanner;

public class Q04SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The max number is : " + max(arr));
    }
    public static int max(int[] array){
        int max = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
