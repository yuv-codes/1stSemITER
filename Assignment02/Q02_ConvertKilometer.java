package assignment1;

import java.util.Scanner;

public class Q02_ConvertKilometer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in kilometers: ");
		float KM = sc.nextFloat();
		float Meter = KM*1000.0f;
		float Feet = KM*3280.8399f;
		float Inch = KM*39370.0787f;
		float CM = KM*100000.0f;
		System.out.println(KM +" km is " + Meter + " meters");
		System.out.println(KM + " km is " + Feet + " feet");
		System.out.println(KM + " km is " + Inch + " inches");
		System.out.println(KM + " km is  " + CM + "centimeters");

	}

}
