package assignment1;
import java.util.Scanner;
public class Q06_DistanceTravelled {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time in seconds: ");
		float t = sc.nextFloat();
		float g = 32.174f;
		double Dist = (1.0f/2)*g*Math.pow(t, 2);
		System.out.println("Distance travelled: " + Dist);

	}

}
