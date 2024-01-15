package assignment1;

public class Q05_HemisphereVolume {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of hemisphere: ");
        double radius = sc.nextDouble();
        double volume = 2.0/3 * Math.PI* Math.pow(radius,3);
        System.out.println("The volume of hemisphere is: " + volume);

  }
}
