public class HomeA_Q02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of the multiples are " + sum);
    }
}
