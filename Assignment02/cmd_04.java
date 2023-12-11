package assignment1;

public class cmd_04 {

	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double num1 = Math.sin(5*t);
		double num2 = Math.cos(7*t);
		double sum = num1 + num2;
		System.out.println(sum);
	}

}
