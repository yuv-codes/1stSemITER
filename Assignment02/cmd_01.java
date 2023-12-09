

public class cmd_01 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("1st number: " + num1 + " & 2nd number: " + num2);
        float rem = num1/num2;
        float quo = num1%num2;
        System.out.println("remainder is: " + rem);
        System.out.println("Quotient is: " + quo);

	}

}
