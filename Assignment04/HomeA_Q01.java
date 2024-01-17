public class HomeA_Q01 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int square = 1;
        int square1 = 1;
        for (int i=1; i<=10; i++){
            square = (i*i);
            sum = sum + square;
//            System.out.println(square);
        }
        System.out.println("The sum of squares = " + sum);

        for (int i=1; i<=10; i++){
            sum1 = sum1 + i;
            square1 = sum1 * sum1;
//            System.out.println(sum1);
        }
        System.out.println("The square of sum = " + square1);
        int diff = square1 - sum;
        System.out.println("The difference between sum of the sqaures and squares of the sum = " + diff);
    }
}
