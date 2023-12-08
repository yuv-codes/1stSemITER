import java.util.Scanner;
public class HomeA02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter co-ordinates: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter co-ordinates: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter co-ordinates: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter co-ordinates: ");
        double y2 = sc.nextDouble();
        System.out.print("Enter co-ordinates: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter co-ordinates: ");
        double y3 = sc.nextDouble();
        System.out.println("1st co-ordinate: " + "(" +x1+"  "+y1+")" );
        System.out.println("2nd co-ordinate: " + "(" +x2+"  "+y2+")" );
        System.out.println("3rd co-ordinate: " + "(" +x3+"  "+y3+")" );
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        System.out.println("Side1: " + side1);
        System.out.println("Side2: " + side2);
        System.out.println("Side3: " + side3);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println("Area of triangle is " + area);
    }
}
