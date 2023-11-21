import java.util.Scanner;
public class Q01_ConvertCelciusToFarenheit {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Degree Farenheit: ");
		
		//  Farenheit to Celcius
		// C/5 = (F-32)/9
		
		float F = sc.nextFloat();
		float C = (F-32)*5.0f/9;
		System.out.println("Degree Celcius: " + C);

	}

}
