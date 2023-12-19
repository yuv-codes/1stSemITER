package assignment1;

public class cmd_HomeA_03 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int f = (a/1000);
		int l = a%10;
		int sum = f + 1;
		System.out.println("Sum: " + sum);
	}

}
