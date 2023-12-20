package assignment1;

public class cmd_HomeA_03 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int first = (num/1000);
		int last = num%10;
		int sum = first + last;
		System.out.println("Sum: " + sum);
	}

}
