package assignment1;

public class cmd_HomeA_01 {

	public static void main(String[] args) {
		double principle = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		double SI = principle*rate*time/100.0;
		System.out.println("The Simple Imterest is: " + SI);

	}

}
