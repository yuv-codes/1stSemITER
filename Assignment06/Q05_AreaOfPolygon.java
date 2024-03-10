import java.util.Scanner;

public class Q05_AreaOfPolygon {
    public static double area(int n, double side){
        return (n*Math.pow(side,2)/(4*Math.tan(Math.PI/n)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of side: ");
        double side = sc.nextDouble();
        System.out.println("The area of polygon is: " + area(n, side));
    }
}
