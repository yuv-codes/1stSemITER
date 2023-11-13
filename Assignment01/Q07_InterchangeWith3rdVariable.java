package assignment1;

public class Q07_InterchangeWith3rdVariable {

	public static void main(String[] args) {
		int X = 5;
		int Y = 7;
		int Z;
		System.out.println("Values before interchange: X = "  + X + " Y = " + Y);
		Z = X;
		X = Y;
		Y = Z;
		System.out.println("Values after interchange: X = " + X + " Y = " + Y);
	}

}
