package assignment1;

public class cmd_HomeA_02 {

	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		
		// Surface Area = πr2+2πrh
		
		double A = Math.PI*Math.pow(r, 2) + 2*Math.PI*r*h;
		System.out.println("Surface Area of the Cylinder = " + A);
		
		
	}

}