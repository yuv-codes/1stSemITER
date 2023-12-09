package assignment1;

public class cmd_02 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		double result = Math.pow(num1, num2);
		System.out.println(result);

	}

}
