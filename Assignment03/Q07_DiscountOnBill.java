import java.util.Scanner;
public class Q07_DiscountOnBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units of electricity used: ");
        double unit = sc.nextDouble();
        double bill = 0;
        if (unit<=50){
            bill=(unit*3);
            System.out.println("Your bill is: " + bill);
        }
        else if (unit>=50 && unit<=200){
            bill=(50*3)+((unit-50)*4.8);
            System.out.println("Your bill is: " + bill);
        }
        else if (unit>=200 && unit<=400){
            bill=(50*3)+(150*4.8)+((unit-150)*4.8);
            System.out.println("Your bill is: " + bill);
        }
        else if (unit>=400) {
            bill = (50 * 3) + (200 * 5.8) + (150 * 4.8) + ((unit - 200) * 6.2);
            System.out.println("Your bill is: " + bill);
        }
        System.out.print("Do you want to pay online: ");
        char pay = sc.next().charAt(0);
        if (pay=='y') {
            bill = bill - (bill * 0.3);
            System.out.println("Your discount is: " + bill*0.3);
            System.out.println("Your bill is: " + bill);
        }else if(pay=='n') {
            bill = bill;
            System.out.println("Your bill is: " + bill);
        }

        }
}

