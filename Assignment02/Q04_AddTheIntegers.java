package assignment1;
import java.util.Scanner;
public class Q04_AddTheIntegers {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Input an integer between 0 and 1000: ");
	        int num = sc.nextInt();

	        int firstDigit = num % 10;
	        int remainingNumber = num / 10;
	        int SecondDigit = remainingNumber % 10;
	        remainingNumber = remainingNumber / 10;
	        int thirdDigit = remainingNumber % 10;
	        remainingNumber = remainingNumber / 10;
	        int fourthDigit = remainingNumber % 10;
	        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
	        System.out.println("The sum of all digits in " + num + " is " + sum);


	}

}
