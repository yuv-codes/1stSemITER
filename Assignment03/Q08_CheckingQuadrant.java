import java.util.Scanner;
public class Q08_CheckingQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x co-ordiante: ");
        double x = sc.nextDouble();
        System.out.print("Enter y co-ordiante: ");
        double y = sc.nextDouble();
        if (x>0 && y>0){
            System.out.println("("+x+" , "+y+")" + " lies in 1st Quadrant");
        }
        else if (x<0 && y>0){
            System.out.println("("+x+" , "+y+")" + " lies in 2nd Quadrant");
        }
        else if (x<0 && y<0){
            System.out.println("("+x+" , "+y+")" + " lies in 3rd Quadrant");
        }
        else if (x>0 && y<0){
            System.out.println("("+x+" , "+y+")" + " lies in 4th Quadrant");
        }
        else if (x==0 && y!=0) {
            System.out.println("(" + x + " , " + y + ")" + " lies on x-axis");
        }
        else if (x!=0 && y==0) {
            System.out.println("(" + x + " , " + y + ")" + " lies on y-axis");
        }
        else if (x==0 && y==0) {
            System.out.println("(" + x + " , " + y + ")" + " lies at origin");
        }
    }
}
