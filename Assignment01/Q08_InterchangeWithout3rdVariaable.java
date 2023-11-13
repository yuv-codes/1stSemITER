package assignment1;

public class Q08_InterchangeWithout3rdVariaable {

	public static void main(String[] args) {
		int X = 5;
		int Y = 7;
		System.out.println("Values before interchange: X = "  + X + " Y = " + Y);
		X = X + Y;
		Y = X - Y;
		X = X - Y;
		System.out.println("Values before interchange: X = "  + X + " Y = " + Y);
		
	}

}
