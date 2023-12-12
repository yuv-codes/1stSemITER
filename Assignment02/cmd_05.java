package assignment1;

public class cmd_05 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		int minab = Math.min(a, b);
		int minabc = Math.min(c, minab);
		
		int maxab = Math.max(a, b);
		int maxabc = Math.max(c, maxab);
		
		int MiddleNumber = a + b + c - maxabc - minabc;
		System.out.println("Max: " + maxabc);
		System.out.println("middleNumber: " + MiddleNumber);
		System.out.println("Min: " + minabc);

	}

}
