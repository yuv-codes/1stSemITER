package assignment1;

import java.util.Scanner;

public class Q03_CalculateFinalSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your basic salary: ");
		float basic = sc.nextFloat();
		float DA = (40*basic)/100;
		float HRA = (20*basic)/100;
		float gross = basic + DA + HRA;
		System.out.println("Your DA is: " + DA);
		System.out.println("Your HRA is: " + HRA);
		System.out.print("Your final Gross Salary is: " + gross);

	}

}
