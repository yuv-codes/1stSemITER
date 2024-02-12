public class Q05_MultiplicationTable {
    public static void main(String[] args) {
        for (int i=2; i<=15; i++){
            System.out.println("Multiplication table of: " + i);
            for (int j=1; j<=10; j++){
                int ans = j*i;
                System.out.println(i+ " x " + j + " = " + ans);
            }
        }
    }
}
