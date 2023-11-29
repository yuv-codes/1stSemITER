package assignment1;

public class Q07_DisplayTable {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("a\t\t\tb\t\t\tpow(a,b)");
		System.out.println(a+ "\t\t\t" + b + "\t\t\t" +(int)Math.pow(a,b));
		a = a + 1;
		b = b + 1;
		System.out.println(a+ "\t\t\t" + b + "\t\t\t" +(int)Math.pow(a,b));
		a = a + 1;
		b = b + 1;
		System.out.println(a+ "\t\t\t" + b + "\t\t\t" +(int)Math.pow(a,b));
	}

}
